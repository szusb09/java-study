## 前言
　　Unsafe类在JDK源码中被广泛使用，在Spark使用off-heap memory时也会使用到，该类功能很强大，涉及到类加载机制[深入理解ClassLoader工作机制](https://blog.csdn.net/zyzzxycj/article/details/89846181)，其实例一般情况是获取不到的，源码中的设计是采用单例模式，不是系统加载初始化就会抛出SecurityException异常。  

　　这个类的提供了一些绕开JVM的更底层功能，基于它的实现可以提高效率。但是，它是一把双刃剑：正如它的名字所预示的那样，它是Unsafe的，它所分配的内存需要手动free（不被GC回收）。如果对Unsafe类理解的不够透彻，就进行使用的话，就等于给自己挖了无形之坑，最为致命。  

　　由于sun并没有将其开源，也没给出官方的Document，所以笔者只能参考一些博客（如Java Magic. Part 4: sun.misc.Unsafe）以及Unsafe在JDK源码中的一些使用，来加深理解。

## 获取Unsafe类的实例
1. 必须是Bootstrap ClassLoader加载的类  
getUnsafe方法源码：  
```
private Unsafe() {
}

@CallerSensitive
public static Unsafe getUnsafe() {
    Class var0 = Reflection.getCallerClass();
    if (!VM.isSystemDomainLoader(var0.getClassLoader())) {
    	throw new SecurityException("Unsafe");
    } else {
    	return theUnsafe;
    }
}
```

isSystemDomainLoader：
```
public static boolean isSystemDomainLoader(ClassLoader var0) {
	return var0 == null;
}
```

2. 通过反射暴力获取

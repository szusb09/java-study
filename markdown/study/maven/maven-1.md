# Maven简介（一）Maven的安装和settings.xml的配置

## 1 Maven的安装
<p style="text-indent:2em">安装Maven之前要确保已经安装好了jdk，并且配置好了环境变量JAVA_HOME。具体安装步骤如下：</p>

1. 从apache网上下载maven项目的压缩包。下载地址为：http://maven.apache.org/download.html 。比如现在最新的Maven版本是3.0.4，那么我下载好的安装文件就是apache-maven-3.0.4.zip。
2. 将下载后的压缩包解压到Maven的安装目录，比如说是D:\\develop，那么解压后就是D:\\develop\\apache-maven-3.0.4。
3. 添加环境变量M2_HOME，其值为Maven的家目录，如D:\\develop\\apache-maven-3.0.4。
4. 添加环境变量M2，其值将为maven安装目录的bin目录，即D:\\develop\\apache-maven-3.0.4\\bin，对于windows系统也可以使用%M2_HOME%\\bin，对于linux系统也可以使用$M2_HOME/bin。
5. 将环境变量M2加入到PATH变量中，对于windows系统，可以在PATH变量的值后面加上“;%M2%”，对于linux系统，可以使用“export path=$path:$M2”
6. 还有一个可选的环境变量MAVEN_OPTS，该环境变量主要是配置Maven在使用jdk的时候指定JVM属性的。如指定其值为“-Xms256m -Xmx512m”。

<p style="text-indent:2em">经过以上几步之后Maven就安装成功了。接下来我们可以在命令窗口使用mvn --version来验证一下Maven是否安装成功。如能正确输出Maven的安装版本，则表示它安装成功了。</p>

## 2 配置Maven的环境信息
<p style="text-indent:2em">在Maven中提供了一个settings.xml文件来定义Maven的全局信息。这个文件会存在于Maven的安装目录的conf子目录下面。或者时用户目录的.m2子目录下面。我们可以通过这个文件来定义本地参考、远程参考和联网使用的代理信息等。</p>

<p style="text-indent:2em">其实相对于多用户的PC机而言，在Maven安装目录的conf子目录下面的settings.xml才是真正的全局的配置。而用户家目录的.m2子目录下面的settings.xml的配置只是针对当前用户的。当这两个文件同时存在的时候，那么对于相同的配置信息用户家目录下面的settings.xml中定义的会覆盖Maven安装目录下面的settings.xml中的定义。用户家目录下的settings.xml文件一般是不存在的，但是Maven允许我们在这里定义我们自己的settings.xml，如果需要在这里定义我们自己的settings.xml的时候就可以把Maven安装目录下面的settings.xml文件拷贝到用户家目录的.m2目录下，然后改成自己想要的样子。</p>

<p style="text-indent:2em">先来看一个基本的settings.xml的样子</p>

```xml {.line-numbers}
<?xml version="1.0" encoding="UTF-8"?>  
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"  
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">  
                 
  <localRepository>D:\\develop\\mavenRepository</localRepository>  
  <interactiveMode>true</interactiveMode>  
  <offline>false</offline>  
  <pluginGroups>  
   
  </pluginGroups>  
   
  <proxies>  
    <proxy>  
      <id>optional</id>  
      <active>true</active>  
      <protocol>http</protocol>  
      <username>proxyuser</username>  
      <password>proxypass</password>  
      <host>proxy.host.net</host>  
      <port>80</port>  
      <nonProxyHosts>local.net|some.host.com</nonProxyHosts>  
    </proxy>  
  </proxies>  
   
  <servers>  
    <server>  
      <id>deploymentRepo</id>  
      <username>repouser</username>  
      <password>repopwd</password>  
    </server>  
  </servers>  
   
  <mirrors>  
    <mirror>  
      <id>mirrorId</id>  
      <mirrorOf>repositoryId</mirrorOf>  
      <name>Human Readable Name for this Mirror.</name>  
      <url>http://my.repository.com/repo/path</url>  
    </mirror>  
  </mirrors>  
   
  <profiles>  
    <profile>  
      <id>jdk-1.5</id>  
      <activation>  
        <jdk>1.5</jdk>  
      </activation>  
      <repositories>  
        <repository>  
          <id>jdk15</id>  
          <name>jdk1.5</name>  
          <url>http://www.myhost.com/maven/jdk15</url>  
          <layout>default</layout>  
          <snapshotPolicy>always</snapshotPolicy>  
        </repository>  
      </repositories>  
    </profile>  
  </profiles>  
  <activeProfiles>  
    <activeProfile>jdk-1.5</activeProfile>  
  </activeProfiles>  
</settings> 
```

&emsp;&emsp;settings.xml中主要包括以下元素：

&emsp;&emsp;**localRepository：** 表示Maven用来在本地储存信息的本地仓库的目录。默认是用户家目录下面的.m2/repository目录。

&emsp;&emsp;**interactiveMode：** 表示是否使用交互模式，默认是true；如果设为false，那么当Maven需要用户进行输入的时候，它会使用一个默认值。

&emsp;&emsp;**offline：** 表示是否离线，默认是false。这个属性表示在Maven进行项目编译和部署等操作时是否允许Maven进行联网来下载所需要的信息。

&emsp;&emsp;**pluginGroups：** 在pluginGroups元素下面可以定义一系列的pluginGroup元素。表示当通过plugin的前缀来解析plugin的时候到哪里寻找。pluginGroup元素指定的是plugin的groupId。默认情况下，Maven会自动把org.apache.maven.plugins和org.codehaus.mojo添加到pluginGroups下。

&emsp;&emsp;**proxies：** 其下面可以定义一系列的proxy子元素，表示Maven在进行联网时需要使用到的代理。当设置了多个代理的时候第一个标记active为true的代理将会被使用。下面是一个使用代理的例子：

```xml {.line-numbers}
<proxies>  
  <proxy>  
      <id>xxx</id>  
      <active>true</active>  
      <protocol>http</protocol>  
      <username>用户名</username>  
      <password>密码</password>  
      <host>代理服务器地址</host>  
      <port>代理服务器的端口</port>  
      <nonProxyHosts>不使用代理的主机</nonProxyHosts>  
  </proxy>  
</proxies> 
```

&emsp;&emsp;**servers：** 其下面可以定义一系列的server子元素，表示当需要连接到一个远程服务器的时候需要使用到的验证方式。这主要有username/password和privateKey/passphrase这两种方式。以下是一个使用servers的示例：
```xml {.line-numbers}
<servers>  
  <server>  
    <id>id</id>  
    <username>用户名</username>  
    <password>密码</password>  
  </server>  
</servers>
```

&emsp;&emsp;**mirrors：** 用于定义一系列的远程仓库的镜像。我们可以在pom中定义一个下载工件的时候所使用的远程仓库。但是有时候这个远程仓库会比较忙，所以这个时候人们就想着给它创建镜像以缓解远程仓库的压力，也就是说会把对远程仓库的请求转换到对其镜像地址的请求。每个远程仓库都会有一个id，这样我们就可以创建自己的mirror来关联到该仓库，那么以后需要从远程仓库下载工件的时候Maven就可以从我们定义好的mirror站点来下载，这可以很好的缓解我们远程仓库的压力。在我们定义的mirror中每个远程仓库都只能有一个mirror与它关联，也就是说你不能同时配置多个mirror的mirrorOf指向同一个repositoryId。以下是一个使用mirrors的例子：
```xml {.line-numbers}
<mirrors>  
    <mirror>  
      <id>mirrorId</id>  
      <mirrorOf>repositoryId</mirrorOf>  
      <name>定义一个容易看懂的名称 </name>  
      <url>http://my.repository.com/repo/path</url>  
    </mirror>  
</mirrors>
```
* **id：** 是用来区别mirror的，所有的mirror不能有相同的id
* **mirrorOf：** 用来表示该mirror是关联的哪一个仓库，其值为其关联仓库的id。当要同时关联多个仓库时，这多个仓库之间可以用逗号隔开；当要关联所有的仓库时，可以使用“*”表示；当要关联除某一个仓库以外的其他所有仓库时，可以表示为“*,!repositoryId”；当要关联不是localhost或用file请求的仓库时，可以表示为“external:*”。
* **url：** 表示该镜像的url。当Maven在建立系统的时候就会使用这个url来连接到我们的远程仓库。

&emsp;&emsp;**profiles：** 用于指定一系列的profile。profile元素由activation、repositories、pluginRepositories和properties四个元素组成。当一个profile在settings.xml中是处于活动状态并且在pom.xml中定义了一个相同id的profile时，settings.xml中的profile会覆盖pom.xml中的profile。

&emsp;&emsp;activation：这是profile中最重要的元素。跟pom.xml中的profile一样，settings.xml中的profile也可以在特定环境下改变一些值，而这些环境是通过activation元素来指定的。看下面一个例子：

```xml {.line-numbers}
<profiles>  
  <profile>  
    <id>test</id>  
    <activation>  
      <activeByDefault>false</activeByDefault>  
      <jdk>1.6</jdk>  
      <os>  
        <name>Windows 7</name>  
        <family>Windows</family>  
        <arch>x86</arch>  
        <version>5.1.2600</version>  
      </os>  
      <property>  
        <name>mavenVersion</name>  
        <value>2.0.3</value>  
      </property>  
      <file>  
        <exists>${basedir}/file2.properties</exists>  
        <missing>${basedir}/file1.properties</missing>  
      </file>  
    </activation>  
    ...  
  </profile>  
</profiles>
```
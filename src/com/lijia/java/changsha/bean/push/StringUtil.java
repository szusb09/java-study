/*
 * Decompiled with CFR 0.137.
 */
package com.lijia.java.changsha.bean.push;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StringUtil {
    public static String isEmpty(String str) {
        if (str == null || str.trim().equals("")) {
            return null;
        }
        return str;
    }

    public static BigDecimal isEmpty(BigDecimal str) {
        if (str == null) {
            return null;
        }
        return str;
    }

    public static Integer isEmpty(Integer str) {
        if (str == null) {
            return null;
        }
        return str;
    }

    public static String appendUnderline(String str) {
        ArrayList<Integer> record = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); ++i) {
            char tmp = str.charAt(i);
            if (tmp > 'Z' || tmp < 'A')
                continue;
            record.add(i);
        }
        if (record.size() > 0 && record.get(0).equals("0")) {
            record.remove(0);
        }
        str = str.toLowerCase();
        char[] charofstr = str.toCharArray();
        String[] t = new String[record.size()];
        for (int i = 0; i < record.size(); ++i) {
            t[i] = "_" + charofstr[(Integer) record.get(i)];
        }
        String result = "";
        int flag = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (flag < record.size() && i == (Integer) record.get(flag)) {
                result = result + t[flag];
                ++flag;
                continue;
            }
            result = result + charofstr[i];
        }
        return result;
    }
}

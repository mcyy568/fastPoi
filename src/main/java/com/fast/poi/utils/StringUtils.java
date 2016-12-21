package com.fast.poi.utils;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 13:21:00
 * 描    述：处理字符串工具类
 */
public class StringUtils {

    /**
     * 首字母转大写
     * @param name  字符串
     */
    public static String captureName(String name) {
        char[] cs = name.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

}

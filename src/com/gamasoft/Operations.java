package com.gamasoft;

/**
 * Created with IntelliJ IDEA.
 * User: uberto
 * Date: 01/10/14
 * Time: 13:32
 * To change this template use File | Settings | File Templates.
 */
public class Operations {

    public static String firstNotEmpty(String s1, String s2) {
        return s1.isEmpty() ? s2 : s1;
    }

    public static String intToStr(int number) {
        return "" + number;
    }
    public static String valueIfMod(int number, int mod, String value) {
        if (number % mod == 0) {
            return value;
        }
        return "";
    }

}

package com.gamasoft;

/**
 * Created with IntelliJ IDEA.
 * User: uberto
 * Date: 01/10/14
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
public class Response {
    private int number;

    public Response(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String r = "";

        r = fizz() + buzz();

        return firstNotEmpty(r, intToStr());
    }

    private String firstNotEmpty(String s1, String s2) {
        return s1.isEmpty() ? s2 : s1;
    }

    private String intToStr() {
        return "" + number;
    }

    private String buzz() {
        if (number % 5 == 0)
            return  "Buzz";
        return "";
    }

    private String fizz() {
        if (number % 3 == 0)
            return  "Fizz";
        return "";
    }
}

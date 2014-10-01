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
        if (number % 3 == 0)
            return "Fizz";

        return "" + number;
    }
}

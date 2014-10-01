package com.gamasoft;

import static com.gamasoft.Operations.firstNotEmpty;
import static com.gamasoft.Operations.intToStr;
import static com.gamasoft.Operations.valueIfMod;

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
        return firstNotEmpty(fizz() + buzz(), intToStr(number));
    }



    private String buzz() {

        return valueIfMod(number, 5, "Buzz");
    }



    private String fizz() {
        return valueIfMod(number, 3, "Fizz");
    }
}

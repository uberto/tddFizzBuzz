package com.gamasoft;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: uberto
 * Date: 30/09/14
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {

    public static String[] EmitNumbers(int from, int to) {

        List<String> res = new ArrayList<String>();
        for (int i = from; i <= to; i++) {
            res.add(processNumber(i).toString());
        }
        return res.toArray(new String[res.size()]);
    }

    private static Response processNumber(int i) {
        return new Response(i);
    }
}

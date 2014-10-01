package com.gamasoft;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: uberto
 * Date: 30/09/14
 * Time: 22:34
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzTest {


    @Test
    public void testEmit() throws Exception {

        String[] numbers = FizzBuzz.EmitNumbers(1, 100);

        Assert.assertEquals(100, numbers.length);
        Assert.assertEquals("1", numbers[0]);
        Assert.assertEquals("100", numbers[99]);
    }

    @Test
    public void test3IsFizz() throws Exception {

        String[] numbers = FizzBuzz.EmitNumbers(3, 3);

        Assert.assertEquals(1, numbers.length);
        Assert.assertEquals("Fizz", numbers[0]);
    }
}

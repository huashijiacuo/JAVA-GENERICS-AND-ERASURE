package com.generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shun on 2017/8/31.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        int a = 1;
        float b = 2.3f;
        double rs = calculator.add(a, b);
        System.out.println("The rs is: " + rs);
    }

}
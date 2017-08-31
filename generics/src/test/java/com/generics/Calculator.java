package com.generics;

/**
 * Created by shun on 2017/8/31.
 */
public class Calculator {
    public static <N extends Number> double add(N a, N b){
        double sum = 0;
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
}

package com.erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shun on 2017/8/31.
 */
public class ErasureCovariant {
    public static void main(String[] args) {
        testCollection(); // 集合
        testArray();  // 数组
    }

    public static void testArray() {
        Integer [] intArray = new Integer[10];
        intArray[0] = 10;
        Number[] numArray = intArray;

        numArray[2] = 3;
        numArray[1] = 2.5f;   // java.lang.ArrayStoreException: java.lang.Float
        System.out.println("numArray[2] = " + numArray[2]);
        System.out.println("numArray[0] = " + numArray[0] + "; numArray[1] = " + numArray[1]);

    }

    public static void testCollection() {
        List<Integer> li = new ArrayList<Integer>();
        //List<Number> ln = li; // illegal
        //ln.add(new Float(3.1415));
    }
}

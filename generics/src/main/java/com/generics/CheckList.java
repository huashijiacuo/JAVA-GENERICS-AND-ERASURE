package com.generics;

import java.util.List;

/**
 * Created by shun on 2017/8/31.
 */
public class CheckList {
    public static <T> void checkList(List<?> myList, T obj) {
        if (myList.contains(obj)) {
            System.out.println("The list contains the element: " + obj);
        } else {
            System.out.println("The list does not contain the element: " + obj);
        }
    }

    public static <T> void checkNubmerList(List<? extends Number> myList, T obj) {
        checkList(myList, obj);
    }
}

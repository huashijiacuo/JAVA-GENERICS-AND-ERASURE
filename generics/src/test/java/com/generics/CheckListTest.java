package com.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by shun on 2017/8/31.
 */
public class CheckListTest {
    @Test
    public void checkListTest() throws Exception {
        // Create List of type Integer
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(2);
        intList.add(4);
        intList.add(6);

        // Create List of type String
        List<String> strList = new ArrayList<String>();
        strList.add("two");
        strList.add("four");
        strList.add("six");

        // Create List of type Object
        List<Object> objList = new ArrayList<Object>();
        objList.add("two");
        objList.add("four");
        objList.add(strList);

        CheckList.checkList(intList, 3);
        // Output:  The list [2, 4, 6] does not contain the element: 3

        CheckList.checkList(objList, strList);
        /* Output:  The list [two, four, [two, four, six]] contains
        the element: [two, four, six] */

        CheckList.checkList(strList, objList);
        /* Output:  The list [two, four, six] does not contain
        the element: [two, four, [two, four, six]] */
    }

}
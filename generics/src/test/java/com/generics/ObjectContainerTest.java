package com.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by shun on 2017/8/31.
 */
public class ObjectContainerTest {
    @Test
    public void getObj1() throws Exception {
        ObjectContainer myObj = new ObjectContainer();

        // store a string
        myObj.setObj("Test");
        System.out.println("Value of myObj:" + myObj.getObj());
        // store an int (which is autoboxed to an Integer object)
        myObj.setObj(3);
        System.out.println("Value of myObj:" + myObj.getObj());

        List objectList = new ArrayList();
        objectList.add(myObj);
        // We have to cast and must cast the correct type to avoid ClassCastException!
        String myStr = (String) ((ObjectContainer)objectList.get(0)).getObj();
        System.out.println("myStr: " + myStr);
    }

    @Test
    public void getObj2() throws Exception {
        ObjectContainer myObj = new ObjectContainer();
        // store a string
        myObj.setObj("Test");
        System.out.println("Value of myObj:" + myObj.getObj());

        List objectList = new ArrayList();
        objectList.add(myObj);
        // We have to cast and must cast the correct type to avoid ClassCastException!
        String myStr = (String) ((ObjectContainer)objectList.get(0)).getObj();
        System.out.println("myStr: " + myStr);
    }

}
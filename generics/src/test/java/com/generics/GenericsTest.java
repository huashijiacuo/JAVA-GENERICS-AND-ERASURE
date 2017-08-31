package com.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shun on 2017/8/31.
 */
public class GenericsTest {

    @Test
    public void testGenerics() throws Exception {
        List myObjList = new ArrayList();

        // Store instances of ObjectContainer
        for(int x=0; x <=10; x++){
            ObjectContainer myObj = new ObjectContainer();
            myObj.setObj("Test" + x);
            myObjList.add(myObj);
        }
        // Get the objects we need to cast
        for(int x=0; x <= myObjList.size()-1; x++){
            ObjectContainer obj = (ObjectContainer) myObjList.get(x);
            System.out.println("Object Value: " + obj.getObj());
        }

        List<GenericContainer> genericList = new ArrayList<GenericContainer>();

        // Store instances of GenericContainer
        for(int x=0; x <=10; x++){
            GenericContainer<String> myGeneric = new GenericContainer<String>();
            myGeneric.setObj(" Generic Test" + x);
            genericList.add(myGeneric);
        }
        // Get the objects; no need to cast to String
        for(GenericContainer<String> obj : genericList){
            String objectString = obj.getObj();
            // Do something with the string...here we will print it
            System.out.println(objectString);
        }
    }
}

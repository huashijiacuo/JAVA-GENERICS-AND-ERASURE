package com.generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shun on 2017/8/31.
 */
public class GenericNumberContainerTest {
    @Test
    public void genericNumberContainerTest() {
        GenericNumberContainer<Integer> gn = new GenericNumberContainer<Integer>();
        gn.setObj(3);
        System.out.println("GenericNumberContainer.obj = " + gn.getObj());
        // Type argument String is not within the upper bounds of type variable T
        // GenericNumberContainer<String> gn2 = new GenericNumberContainer<String>();
    }

}
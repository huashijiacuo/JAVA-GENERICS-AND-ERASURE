package com.erasure;

import java.util.ArrayList;

/**
 * Created by shun on 2017/8/31.
 */
public class ErasureProblem {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("b");
        // accept(al); //编译不过

        test(al);
        ArrayList<Object> a = new ArrayList<>();
        a.add("abc");
        a.add(1);
        test(a);
    }

    public static void accept(ArrayList<Object> al) {
        for (Object o : al)
            System.out.println(o);
    }

    public static void test(ArrayList<?> al) {
        for (Object e : al) {// no matter what type, it will be Object
            System.out.println(e);
            // in this method, because we don’t know what type ? is, we can not
            // add anything to al.
        }
    }


}

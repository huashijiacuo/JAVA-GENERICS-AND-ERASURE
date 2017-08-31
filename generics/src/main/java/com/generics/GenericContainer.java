package com.generics;

/**
 * Created by shun on 2017/8/31.
 */
public class GenericContainer<T> {
    private T obj;

    public GenericContainer(){
    }

    // Pass type in as parameter to constructor
    public GenericContainer(T t){
        obj = t;
    }

    /**
     * @return the obj
     */
    public T getObj() {
        return obj;
    }

    /**
     * @param t the obj to set
     */
    public void setObj(T t) {
        obj = t;
    }

    public static void main(String[] args) {
        GenericContainer myInt = new GenericContainer();
        myInt.setObj(3);
        System.out.println("The Obj is " + myInt.getObj());
        myInt.setObj("Test");
        System.out.println("The Obj is " + myInt.getObj());
    }
}

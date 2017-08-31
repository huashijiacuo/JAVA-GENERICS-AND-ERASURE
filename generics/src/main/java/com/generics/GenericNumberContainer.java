package com.generics;

/**
 * Created by shun on 2017/8/31.
 */
public class GenericNumberContainer<T extends Number> {
    private T obj;

    public GenericNumberContainer(){
    }

    public GenericNumberContainer(T t){
        obj = t;
    }
    /**
     * @return
    the obj
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
}

package com.erasure;

/**
 * Created by shun on 2017/8/31.
 */
public class ErasureCast {
    public static void main(String[] args) {
        Object obj = "stringObj";
        String target = "aaa";
        String str = naiveCast(target, obj);
        System.out.println(str);
    }
    public static  <T> T naiveCast(T t, Object o) {
        return (T) o;
    }

    public static <T> T getTypeInstance() {
        //return new T();
        Object obj = new Object();
        return (T) obj;
    }
}

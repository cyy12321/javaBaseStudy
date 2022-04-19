package com.myMethod;

import java.util.ConcurrentModificationException;

public class ExceptionDemo001 {
        public static void main(String[] args) {
            System.out.println("开始");
            method();
            System.out.println("结束");
        /*输出结果：
        开始
        java.lang.ArrayIndexOutOfBoundsException: 3
	    at com.myMethod.ExceptionDemo001.method(ExceptionDemo001.java:18)
	    at com.myMethod.ExceptionDemo001.main(ExceptionDemo001.java:6)
        结束*/
        }
        public static void method(){
            try {
                int[] arr = {1,2,3};
                System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
}


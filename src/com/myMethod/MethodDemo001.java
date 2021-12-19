package com.myMethod;

import java.util.Scanner;

public class MethodDemo001 {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }
    //需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber() {
        int num = 10;
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

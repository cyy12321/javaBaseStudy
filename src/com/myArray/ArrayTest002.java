package com.myArray;

public class ArrayTest002 {
    public static void main(String[] args) {
        //定义两个数组
        int[] arr = new int[2];
        int[] arr2 = new int[3];

        //分别输出数组名及元素
        System.out.println(arr);//输出内存地址：[I@1b6d3586
        System.out.println(arr[0]);//输出0
        System.out.println(arr[1]);//输出0

        System.out.println(arr2);//输出内存地址：[I@4554617c
        System.out.println(arr2[0]);//输出0
        System.out.println(arr2[1]);//输出0
        System.out.println(arr2[2]);//输出0

        //分别给元素赋值
        arr[0] = 100;
        arr2[0] = 200;
        arr2[2] = 300;

        //分别再次输出两个数组名及元素
        System.out.println(arr);//输出内存地址：[I@1b6d3586
        System.out.println(arr[0]);//输出100
        System.out.println(arr[1]);//输出0

        System.out.println(arr2);//输出内存地址：[I@4554617c
        System.out.println(arr2[0]);//输出200
        System.out.println(arr2[1]);//输出0
        System.out.println(arr2[2]);//输出300
    }
}

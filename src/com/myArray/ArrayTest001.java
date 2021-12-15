package com.myArray;

public class ArrayTest001 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[3];

        //输出数组名及元素
        System.out.println(arr);//输出[I@1b6d3586
        System.out.println(arr[0]);//输出0
        System.out.println(arr[1]);//输出0
        System.out.println(arr[2]);//输出0

        //给数组中的元素赋值
        arr[0] = 100;
        arr[2] = 200;

        //再次输出数组名及元素
        System.out.println(arr);//输出[I@1b6d3586
        System.out.println(arr[0]);//输出100
        System.out.println(arr[1]);//输出0
        System.out.println(arr[2]);//输出200
    }
}

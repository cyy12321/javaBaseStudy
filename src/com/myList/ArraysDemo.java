package com.myList;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {32,67,16,98,5};
        System.out.println("排序前："+ Arrays.toString(arr));//排序前：[32, 67, 16, 98, 5]
        Arrays.sort(arr);
        System.out.println("排序后："+ Arrays.toString(arr));//排序后：[5, 16, 32, 67, 98]
    }
}

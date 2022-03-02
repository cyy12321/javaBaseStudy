package com.myArray;

import java.util.Scanner;

public class CompareArr {
    public static void main(String[] args) {
        //定义两个数组，用于比较两个数组的内容是否相同
        int[] arr1={11,22,33,44,55};
        int[] arr2={11,22,33,44,55};
        boolean flag = compare(arr1,arr2);
        System.out.println(flag);
    }
    public static boolean compare(int[] arr1,int[] arr2) {
        //首先比较数组长度，如果长度不相同，内容肯定不相同，返回false
        if (arr1.length != arr2.length) {
            return false;
        }
        //其次遍历数组中的每一个元素,只要有元素不相同，则返回false
        for(int x = 0;x<arr1.length;x++){
            if(arr1[x]!=arr2[x]){
                return false;
            }
        }
        return true;
    }
}

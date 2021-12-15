package com.myArray;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        /*
        左边：
            int:说明数组中的元素类型是int类型
            []:说明这是一个数组
            arr:这是数组的名称
        右边：
            new：为数组申请内存空间
            int：说明数组中的元素类型是int类型
             []:说明这是一个数组
              3:数组长度，其实就是数组中的元素个数
         */
        //输出数组名
        System.out.println(arr);//[I@1b6d3586
        //输出数组中的元素
        System.out.println(arr[0]);//输出0,系统为数组分配初始值
        System.out.println(arr[1]);//输出0,系统为数组分配初始值
        System.out.println(arr[2]);//输出0,系统为数组分配初始值
    }
}

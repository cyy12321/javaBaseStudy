package com.myArray;

public class BianliArray {
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,5};
        //定义一个变量，用于保存最大值（或最小值）
        int max = arr[0];//取数组中第一个数据作为变量初始值
        //与数组中剩余的数据逐个比对，每次比对将最大值保存到变量中
        for(int x = 1;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        //循环结束后打印变量的值
        System.out.println("最大值是:"+max);
    }
}

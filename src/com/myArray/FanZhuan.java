package com.myArray;
//已知一个数组arr={19,28,37,46,50};用程序实现把数组中的元素值交换
//交换后的数组arr={50,46,37,28,19};并在控制台输出交换后的数组元素
public class FanZhuan {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        reserve(arr);//调用反转的方法
        printArr(arr);//遍历数组
    }
    public static void reserve(int[] arr) {
        //循环遍历数组，初始化语句定义两个索引变量，判断条件：开始索引<=结束索引
        for(int start=0,end = arr.length-1;start<=end;start++,end--){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
        }
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for(int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}


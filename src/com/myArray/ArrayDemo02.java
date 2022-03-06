package com.myArray;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //设计一个方法用于数组遍历,要求遍历的结果是在一行上的。例如:[11,22,33,44,55]
        int[] arr01 = {11,22,33,44,55};
        String s = bianliArr(arr01);
        System.out.println(s);

        //设计一个方法用于获取数组中元素的最大值，调用方法并输出结果
        int[] arr02 = {1,3,6,3,2,1,8,5};
        int max = getMax(arr02);
        System.out.println(max);
    }
    public static  int getMax(int[] arr){
        int max = arr[0];
        for(int x = 0;x<arr.length;x++){
           if(max<arr[x]){
               max =  arr[x];
           }
        }
        return max;
    }
    public static String  bianliArr(int[] arr01){
        String s = "[";
        for(int i = 0;i<arr01.length;i++){
            if(i==arr01.length-1){
                s+=arr01[i];
            }else{
                s+=arr01[i]+",";
            }
        }
        s=s+"]";
        return s;
    }
}

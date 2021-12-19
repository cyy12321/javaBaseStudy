package com.myMethod;

public class MethodDemo2 {
    public static void main(String[] args) {
        //调用方法
        getMax();
    }
    //需求：设计一个方法用于打印两个数中较大值
    //定义一个方法，用于打印两个数字中的较大数
    public static void getMax(){
        //方法中定义两个变量，用于保存两个数字
        int a=10;
        int b = 20;
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}

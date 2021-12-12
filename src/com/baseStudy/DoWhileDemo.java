package com.baseStudy;

public class DoWhileDemo {
    public static void main(String[] args) {
        //需求：在控制台输出5次"HelloWorld!"
        //for循环实现
        for(int i = 0;i<5;i++){
            System.out.println("HelloWorld!");
        }
        System.out.println("--------");
        //do...while循环实现
        int j = 0;//初始化语句
        do{
            System.out.println("HelloWorld!");
            j++;
        }while(j<5);
    }
}

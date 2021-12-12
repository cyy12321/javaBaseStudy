package com.baseStudy;

public class whileDemo {
    public static void main(String[] args) {
        //在控制台输出5次HelloWorld!
        //for循环实现
        for(int i = 0;i<5;i++){
            System.out.println("HelloWorld!");
        }
        System.out.println("--------");

        //while循环实现
        int j=1;//1.初始化语句
        while(j<=5){//2.条件判断语句
            System.out.println("HelloWorld!");//3.循环体语句
            j++;//4.条件控制语句
        }
    }
}

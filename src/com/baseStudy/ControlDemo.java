package com.baseStudy;

public class ControlDemo {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i%2==0){//是否偶数
                continue;//跳过某次循环，继续下一次循环
            }
            System.out.println(i);//跳过偶数，输出1、3、5
        }
        System.out.println("--------");
        for(int i=1;i<=5;i++){
            if(i%2==0){//是否偶数
                break;//终止循环
            }
            System.out.println(i);//遇到偶数，终止循环，只输出1
        }
    }
}

package com.baseStudy;

public class ShuiXianHua {
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
            int a = i%10;//个位数
            int b = i/10%10;//十位数
            int c = i/100;//百位数
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}

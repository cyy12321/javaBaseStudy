package com.baseStudy;

public class ShuiXianHua {
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
                int a = i%10;//个位数
                int b = i/10%10;//十位数
                int c = i/100;//百位数
                if(a*a*a+b*b*b+c*c*c==i){
                    System.out.println(i);
                }
        }

        int count = 0;
        for(int i = 100;i<1000;i++){
            int a = i%10;//个位数
            int b = i/10%10;//十位数
            int c = i/100;//百位数
            if(a*a*a+b*b*b+c*c*c==i){
                count++;
            }
        }
        System.out.println("水仙花数的个数为："+count);
    }
}

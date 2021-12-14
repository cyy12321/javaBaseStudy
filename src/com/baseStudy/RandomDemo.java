package com.baseStudy;
import java.util.Random;//1.导包
public class RandomDemo {
    public static void main(String[] args) {
       Random r = new Random();//2.创建对象
        //用循环获取10个随机数
        for(int i=0;i<10;i++){
            int number = r.nextInt(10);//获取随机数
            System.out.println("number"+number);
        }
        System.out.println("--------");
        //需求：获取一个1-100之间的随机数
        int num = r.nextInt(100)+1;//0-99,不包括100，可+1
        System.out.println("num:"+num);
    }
}

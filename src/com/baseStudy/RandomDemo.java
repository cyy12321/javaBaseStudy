package com.baseStudy;

import java.util.Random;//1.导包
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();//2.创建对象
        //用循环获取10个随机数
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10);//获取随机数
            System.out.println("number" + number);
        }
        System.out.println("--------");
        //需求：获取一个1-100之间的随机数
        int num = r.nextInt(100) + 1;//0-99,不包括100，可+1
        System.out.println("num:" + num);
        System.out.println("--------");
        /*程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
        猜的数字比真实数字大，提示猜大了
        猜的数字比真实数字小，提示猜小了
        猜的数字与真实数字相等，提示猜中了*/
        Random random = new Random();
        int factNum = random.nextInt(100) + 1;
        System.out.println("生成的随机数为:" + factNum);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNum = sc.nextInt();
            if (guessNum > factNum) {
                System.out.println("你猜的数字" + guessNum + "大了");
            } else if (guessNum < factNum) {
                System.out.println("你猜的数字" + guessNum + "小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }

    }
}

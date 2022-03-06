package com.baseStudy;

import java.util.Scanner;

public class IfTest001 {
    public static void main(String[] args) {
        //1-100之间的满足逢7必过规则的数据(包含7或者是7的倍数）
        String s = "";
        int[] arr = {};
        for(int i = 1;i<=100;i++){
            if(i%7==0){
                s+=i+" ";
                continue;//跳出本次本次循环，继续下次循环
            }
            if((i+"").contains("7")){
                s+=i+" ";
                continue;
            }
        }
        System.out.println(s);
        //输入星期数，显示今天的减肥活动
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入：");
//        int today = sc.nextInt();
//        switch (today) {
//            case 1:
//                System.out.println("跑步");
//                break;
//            case 2:
//                System.out.println("游泳");
//                break;
//            case 3:
//                System.out.println("慢走");
//                break;
//            case 4:
//                System.out.println("动感单车");
//                break;
//            case 5:
//                System.out.println("拳击");
//                break;
//            case 6:
//                System.out.println("爬山");
//                break;
//            case 7:
//                System.out.println("好好吃一顿");
//                break;
//            default:
//                System.out.println("您输入的星期数有误");
//    }
    }
}

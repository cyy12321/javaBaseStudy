package com.baseStudy;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入月份,如要退出请输入100");
        while (true){
            int month = sc.nextInt();
            //1、2、12冬季
            //3、4、5春季
            //6、7、8夏季
            //9、10、11秋季
            switch(month){
                case 1:
                case 2:
                case 12:
                    System.out.println("冬季");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                default:
                    System.out.println("您输入的月份有误");
                    break;
            }
            if(month==100){
                System.out.println("结束此次循环，谢谢光临");
                break;
            }
        }

    }
}

package com.baseStudy;

import java.util.Scanner;

public class JiOuIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        while(true) {
            String week = sc.next();
            switch (week) {
                case "1":
                    System.out.println("今天是星期一");
                    break;
                case "2":
                    System.out.println("今天是星期二");
                    break;
                case "3":
                    System.out.println("今天是星期三");
                    break;
                case "4":
                    System.out.println("今天是星期四");
                    break;
                case "5":
                    System.out.println("今天是星期五");
                    break;
                case "6":
                    System.out.println("今天是星期六");
                    break;
                case "7":
                    System.out.println("今天是星期日");
                    break;
                case "quit":
                    System.out.println("谢谢使用，程序退出");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
            if("quit".equals(week)){
                break;
            }
        }
    }
}

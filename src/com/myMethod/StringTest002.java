package com.myMethod;

import java.util.Scanner;

public class StringTest002 {
    public static void main(String[] args) {
        //需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        int smallCount = 0;
        int bigCount = 0;
        int digitCount = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
                smallCount++;
            }else if(c>='A'&&c<='Z'){
                bigCount++;
            }else {
                digitCount++;
            }
        }
        System.out.println("小写字母个数为:"+smallCount);
        System.out.println("大写字母个数为:"+bigCount);
        System.out.println("数字字符个数为:"+digitCount);
    }
}

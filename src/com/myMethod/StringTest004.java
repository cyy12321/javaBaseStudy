package com.myMethod;

import java.util.Scanner;

public class StringTest004 {
    public static void main(String[] args) {
        //需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
        // 例如：键盘录入abc,输出结果cba
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        String fs = fanZ(str);
        System.out.println("反转后的结果为："+fs);
    }

    public static String fanZ(String s) {
        String fz = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            fz += s.charAt(i);
        }
        return fz;
    }
}

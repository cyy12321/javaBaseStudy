package com.myMethod;

public class StringBuildDemo01 {
    public static void main(String[] args) {
        StringBuilder sb01 = new StringBuilder();
        //public StringBuilder append(任意类型):添加数据，并返回对象本身
        //方法一：
        sb01.append("hello");
        sb01.append("world");
        sb01.append(100);
        System.out.println("sb01:"+sb01);//sb01:helloworld100
        //方法二：链式编程
        StringBuilder sb02 = new StringBuilder();
        sb02.append("a").append("c").append(6);
        System.out.println("sb02:"+sb02);//sb02:ac6
        //反转
        //public StringBuilder reverse():返回相反的字符序列
        sb01.reverse();
        System.out.println(sb01);//001dlrowolleh
    }
}

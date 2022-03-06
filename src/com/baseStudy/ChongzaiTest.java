package com.baseStudy;

public class ChongzaiTest {
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short)10,(short)20));
        System.out.println(compare(10L,20L));

        int number = 100;
        System.out.println("调用change方法前："+number);//调用change方法前：100
        change(number);
        System.out.println("调用change方法后："+number);//调用change方法后：100
    }
    //int
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }
    //byte
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    //short
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a==b;
    }
    //long
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }
    public static void change(int number){
        number = 200;
    }
}

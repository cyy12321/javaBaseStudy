package com.baseStudy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.PortableInterceptor.INACTIVE;

public class IntegerDemo {
    public static void main(String[] args) {
        //int 转换成----> String
        int number = 100;
        //方式一：
        String s1 = ""+100;
        System.out.println(s1);//输出结果：100
        //方式二:
        //public static Integer valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);//输出结果：100

        //String 转换成----> int
        String s = "100";
        //方式一：
        //String ---->Integer-----> int
        Integer i = Integer.valueOf(s);//String ---->Integer
        //public int intValue()
        int x = i.intValue();//Integer-----> int
        System.out.println(x);//输出结果：100
        //方式二：
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);//输出结果：100
    }
}

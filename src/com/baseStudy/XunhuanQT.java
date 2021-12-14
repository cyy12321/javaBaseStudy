package com.baseStudy;

public class XunhuanQT {
    public static void main(String[] args) {
        //在控制台输出一天的小时和分钟
        //分钟：0<=minute<60
        //小时：0<=hour<24
        //外循环控制小时的范围，内循环控制分钟的范围
        for(int hour = 0;hour<24;hour++){
            for(int minter=0;minter<60;minter++){
                System.out.println(hour+"时"+minter+"分");
            }
        }

    }
}

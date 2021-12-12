package com.baseStudy;

public class ZhuMuMontain {
    public static void main(String[] args) {
        //世界上最高山峰是珠穆朗玛峰（8848.43米=8844430毫米），假如我有一张足够大的纸，它的厚度是0.1毫米。
        // 请问，我折叠多少次，可以折成珠穆朗玛峰的高度
        //折叠一次，0.1*2
        //折叠2次，0.1*2*2
        //折叠3次，0.1*2*2*2
        int count = 0;//定义一个计数器，初始值为0
        double paper = 0.1;//定义纸张厚度
        int zf = 8844430;//定义珠穆朗玛峰的高度
        while(paper<=zf){
            paper *= 2;
            count++;
        }
        System.out.println("需要折叠："+count+"次");
    }
}

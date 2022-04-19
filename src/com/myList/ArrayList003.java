package com.myList;

import java.util.ArrayList;
public class ArrayList003 {
    public static void main(String[] args) {
        //需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();
        //往集合中添加字符串对象
        arrayList.add("zhangsan");
        arrayList.add("lisi");
        arrayList.add("wangwu");
        System.out.println(arrayList);//[zhangsan, lisi, wangwu]
        for(int i = 0;i<arrayList.size();i++){
            String s = arrayList.get(i);
            System.out.println(s);/*zhangsan
                                    lisi
                                    wangwu*/
        }
    }
}

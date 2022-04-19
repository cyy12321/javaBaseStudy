package com.jihe;

import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        //添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        //不包含重复元素的集合
        linkedHashSet.add("world");
        //遍历
        for (String s : linkedHashSet) {
            System.out.println(s);
            /*输出：
            hello
            world
            java*/
        }
    }
}

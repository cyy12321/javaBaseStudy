package com.jihe;

import java.util.TreeSet;
public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建对象
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //添加元素
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(40);
        //不包含重复元素
        treeSet.add(30);
        //遍历集合
        for (Integer integer : treeSet) {
            System.out.println(integer);
            /*输出结果：
            10
            20
            30
            40
            50*/
        }
    }
}

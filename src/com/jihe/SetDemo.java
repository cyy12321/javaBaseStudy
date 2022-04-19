package com.jihe;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {
    public static void main(String[] args) {
        //创建集合
        Set<Integer> set = new HashSet<Integer>();//获取无序集合
        //Set<Integer> set = new TreeSet<Integer>();//获取有序集合
        Random random = new Random();
        while (set.size()<10){
            int i = random.nextInt(20) + 1;
            set.add(i);
        }
        for (Integer integer : set) {
            System.out.println(integer);
            /*输出：
            17
            19
            4
            5
            8
            9
            11
            12
            14
            15*/
        }
    }
}

package com.jihe;
import java.util.HashSet;
public class HashSetDemo001 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        //添加元素
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("java");
        //不包含重复元素的集合
        hashSet.add("world");
        //遍历
        for (String s : hashSet) {
            System.out.println(s);
            /*输出：
            world
            java
            hello*/
        }
    }
}

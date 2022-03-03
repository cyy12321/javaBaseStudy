package com.myList;
import java.util.ArrayList;
public class ArrayList001 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        System.out.println(array);//输出：[]

        //public boolean add(E e):将指定的元素追加到此集合的末尾
        boolean flag = array.add("hello");
        System.out.println(flag);//输出：true

        array.add("world");
        System.out.println(array);//输出：[hello, world]  ---拼接时自动有“，”和空格

        //public void add(int index,E element)；在此集合的指定位置插入指定的元素
        array.add(1,"flower");
        System.out.println(array);//输出：[hello, flower, world]  --拼接时自动有“，”和空格
        array.add(3,"last");
        System.out.println(array);//输出：[hello, flower, world, last]
        array.add(5,"111");
        System.out.println(array);//程序报错：IndexOutOfBoundsException集合的索引越界
    }
}

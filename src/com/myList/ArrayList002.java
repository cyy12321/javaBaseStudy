package com.myList;

import java.util.ArrayList;

/*public boolean remove(Object o):删除指定的元素，返回删除是否成功
        public E remove(int index)：删除指定索引的元素，返回被删除的元素
        public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        public E get(int index):返回指定索引处的元素
        public int size():返回集合中元素的个数*/
public class ArrayList002 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);//[hello, world, java]
        System.out.println(array.set(1,"abc"));//world
        System.out.println(array);//[hello, abc, java]
        //System.out.println(array.set(3,"gb"));//IndexOutOfBoundsException
        //System.out.println(array.get(3));//IndexOutOfBoundsException
    }
}

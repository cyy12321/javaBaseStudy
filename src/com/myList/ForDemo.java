package com.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ForDemo {
    public static void main(String[] args) {
        LinkedList<String>  linkedList= new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println(linkedList);//输出:[hello, world, java]
        linkedList.addFirst("javaee");
        linkedList.addLast("abc");
        System.out.println(linkedList);//输出:[javaee, hello, world, java, abc]
        linkedList.removeFirst();
        System.out.println(linkedList);//输出:[hello, world, java, abc]
        System.out.println(linkedList.getFirst());//输出:hello
    }
}

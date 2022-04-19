package com.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();//通过iterator()方法得到迭代器对象it
        /*ArrayList内的源码方法：
        public Iterator<E> iterator() {
            return new Itr();
        }
        private class Itr implements Iterator<E> {
            ...
        }*/
        while (it.hasNext()){//如果集合内有元素，则返回集合中的下一个元素
            String s = it.next();
            System.out.println(s);
        }
    }
}

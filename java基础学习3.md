### 48、集合基础 ArrayList

集合类的特点：提供一种存储空间可变的存储模型，存储的数据容量可以发生改变

ArrayList<E>:

- 可调整大小的数组实现
- <E>:是一种特殊的数据类型，泛型

### 49、ArrayList构造方法和添加方法

```java
public ArrayList():创建一个空的集合对象
public boolean add(E e):将指定的元素追加到此集合的末尾
public void add(int index,E element)；在此集合的指定位置插入指定的元素
```

```java
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
```

### 50、ArrayList常用方法

```java
public boolean remove(Object o):删除指定的元素，返回删除是否成功
public E remove(int index)：删除指定索引的元素，返回被删除的元素
public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
public E get(int index):返回指定索引处的元素
public int size():返回集合中元素的个数；相当于数组中的length()
```

```java
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
```

51、ArrayList存储字符串并遍历
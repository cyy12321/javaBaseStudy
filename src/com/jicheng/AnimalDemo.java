package com.jicheng;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
       Animal a = new Cat();
       a.setName("加菲");
       a.setAge(5);
       System.out.println(a.getName()+","+a.getAge());
       a.eat();
       System.out.println("---------");
       a = new Cat("加菲1",6);
       System.out.println(a.getName()+","+a.getAge());
       a.eat();
       /*输出结果：
        加菲,5
        猫吃鱼
        ---------
        加菲1,6
        猫吃鱼*/
    }
}

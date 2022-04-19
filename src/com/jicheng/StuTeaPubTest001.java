package com.jicheng;

//测试类
public class StuTeaPubTest001 {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();//无参构造方法
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());//林青霞,30
        t1.teach();//用心教好每一位学生

        //带参构造方法
        Teacher t2 = new Teacher("张三",36);
        t2.setName("张三");
        t2.setAge(18);
        System.out.println(t2.getName()+","+t2.getAge());//张三,18
        t2.teach();//用心教好每一位学生
    }
}

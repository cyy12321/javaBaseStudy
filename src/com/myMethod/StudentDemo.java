package com.myMethod;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(30);
        s1.show();//输出值为张三,30

        //public Student(String name,int age)
        Student s2 = new Student("张三",30);
        s2.show();//输出值为张三,30
    }
}

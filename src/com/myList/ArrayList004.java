package com.myList;

import java.util.ArrayList;

public class ArrayList004 {
    public static void main(String[] args) {
        /*2.创建集合对象*/
        ArrayList<Student> arrayList = new ArrayList<Student>();
        /*3.创建学生对象*/
        Student s1 = new Student("zhangsan",19);
        Student s2 = new Student("lisi",20);
        Student s3 = new Student("wangwu",21);
        /*4.添加学生对象到集合中*/
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        /*5.遍历集合，采用通用遍历格式实现*/
        for(int i = 0;i<arrayList.size();i++){
            Student s = arrayList.get(i);
            System.out.println("name:"+s.getName()+","+"age:"+s.getAge());
        }
    }

}

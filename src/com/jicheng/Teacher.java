package com.jicheng;

public class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name,int age){
        /*this.name = name;//报错能直接访问父类的私有成员变量
        this.age =  age;//报错：不能直接访问父类的私有成员变量*/
        super(name,age);
    }
    public void teach(){
        System.out.println("用心教好每一位学生");
    }
}

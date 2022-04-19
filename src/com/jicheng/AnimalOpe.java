package com.jicheng;

public class AnimalOpe {
    public void userAnimal(Animal a){
        a.eat();
        //a.lookDoor();//无法调用此方法，报错--因为不能使用子类的特有功能
    }
}

package com.jihe;

public class GenericIntefaceImpl<T> implements GenericInteface<T> {
    @Override
    public void show(T t){
        System.out.println(t);
    }
}

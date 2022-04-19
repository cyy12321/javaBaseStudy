package com.jihe;

public class GenericDemo {
    public static void main(String[] args) {
        GenericInteface<String> g1 = new GenericIntefaceImpl<String>();
        g1.show("林青霞");//林青霞

        GenericInteface<Integer> g2 = new GenericIntefaceImpl<Integer>();
        g2.show(30);//30
    }
}

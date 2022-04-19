package com.jihe;

public class ArgsDemo001 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));//15
        System.out.println(sum(10,20,30,40,50));//150
        System.out.println(sum(100,200,300));//600
    }
    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}

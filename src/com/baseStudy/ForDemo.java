package com.baseStudy;

public class ForDemo {
    public static void main(String[] args) {
        //在控制台输出5次HelloWord!
        for(int i = 0;i<5;i++){
            System.out.println("HelloWorld!");
        }
        //输出1-5
        for(int a = 1;a<=5;a++){
            System.out.println(a);
        }
        System.out.println("-------------");
        //输出5-1
        for(int b = 5;b>=1;b--){
            System.out.println(b);
        }
        System.out.println("-------------");
        int sum = 0;
        for(int i = 1;i<=5;i++){
            sum += i;//sum=sum+i
        }
        System.out.println("1-5的数据加和："+sum);

        System.out.println("-------------");

        //求1-100之间的偶数和，并把求和结果在控制台输出
        int ouSum = 0;
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                ouSum += i;//ouSum=ouSum+i
            }
        }
        System.out.println("1-100之间的偶数和是："+ouSum);
    }
}

package com.baseStudy;

public class Rabbit {
    //有一对兔子，从出生后第三个月起每个月都生一对兔子，
    // 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月的兔子对数是多少
    /*第1个月：  1
      第2个月：  1
      第3个月：  2
      第4个月：  3
      第5个月：  5*/
    public static void main(String[] args) {
        //为了存储多个月的兔子对数，定义一个数组，用哪个动态初始化完成数组元素的初始化，数组长度为20
        int[] arr = new int[20];

        //第1个月和第2个月兔子的对数已知，都是1
        arr[0]=1;
        arr[1]=1;
        for(int i = 2;i<arr.length;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        //输出数组中最后一个元素的值=第20个月兔子对数
        System.out.println("第二十个月的兔子的对数是："+arr[19]);
    }
}

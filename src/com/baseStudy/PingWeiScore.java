package com.baseStudy;

public class PingWeiScore {
    public static void main(String[] args) {
        /*在编程竞赛中，有6个评委为参赛的选手打分，分数0-100的整数分
        选手的最高得分为：去掉一个最高分和一个最低分后的4个评委平均值(不考虑小数部分）*/
        int[] arr = {87,98,98,76,82,70};
        for(int x = 0;x<arr.length;x++){
            if(x<arr.length-1&&arr[x]>arr[x+1]){
                int temp = arr[x];
                arr[x]=arr[x+1];
                arr[x+1]=temp;
            }
        }
        String  s = "[";
        for(int y =0 ;y<arr.length;y++){
            s+=arr[y];
        }
        System.out.println("s:"+s);
        /*int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int x =0;x<arr.length;x++){
            //会涉及到有两个相同最大值或最小值,故不可取
            *//*if(arr[x]!=max&&arr[x]!=min){
                sum+=arr[x];
            }*//*
            sum+=arr[x];
        }
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("avg:"+avg);*/
    }
}

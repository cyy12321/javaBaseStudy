package com.myArray;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {83,58,29,90,32};
        System.out.println("排序前："+arrayToString(arr));
        for(int i = 0;i<arr.length-1;i++){//n个元素，比较n-1次
            for(int x = 0;x<arr.length-1-i;x++){//每次比较（arr.length-1-x）个元素
                if(arr[x]>arr[x+1]){
                    int temp = arr[x];
                    arr[x]=arr[x+1];
                    arr[x+1]=temp;
                }
            }
        }
        System.out.println("排序后："+arrayToString(arr));
    }

    /*方法定义：两个明确：
    返回值类型：String;
    参数：int[] arr*/
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}

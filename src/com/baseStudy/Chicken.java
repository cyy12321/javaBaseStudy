package com.baseStudy;

//需求：在我国古代数学张丘建在《算经》一书中提出的数学问题：
//鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一，
//百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
/*
鸡翁：x  5x
鸡母；y  3y
鸡雏：z  1/3z
x+y+z=100
5x+3y+1/3z=100
0<=x<=20
0<=y<=33
0<=z<=100
*/
public class Chicken {
    public static void main(String[] args) {
        for(int x=0;x<=20;x++){//鸡翁
            for(int y=0;y<=33;y++){//鸡母
                int z = 100-x-y;//鸡雏
                if(z%3==0&&5*x+3*y+z/3==100){
                    System.out.println(x+","+y+","+z);
                }
            }
        }
    }
}

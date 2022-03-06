package com.myMethod;

import java.util.Scanner;

public class Login001 {
    public static void main(String[] args) {
    //需求：已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应提示
    String username =  "zhangsan";
    String password = "abc123";
    for(int i = 0;i<3;i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String inputUser = sc.nextLine();
        System.out.println("请输入密码：");
        String inputPass = sc.next();
        if(inputUser.equals(username)&&inputPass.equals(password)){
            System.out.println("登录成功");
            break;
        }else{
            if(2-i==0){
                System.out.println("您的账户被锁定,请与管理员联系");
            }else{
                System.out.println("登录失败"+"你还有"+(2-i)+"次机会");
            }
        }
    }
    }
}

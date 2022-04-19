package com.io;

import java.io.File;
public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("javaBaseStudy\\java.txt");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//false
        System.out.println(f1.exists());//true
        System.out.println("--------");
        System.out.println(f1.getAbsoluteFile());//D:\workspace\javaBaseStudy\javaBaseStudy\java.txt
        System.out.println(f1.getPath());//javaBaseStudy\java.txt
        System.out.println(f1.getName());//java.txt
        System.out.println("--------");
        File f2 = new File("E:\\testFile");
        String[] strArray = f2.list();
        for (String s : strArray) {
            System.out.println(s);//输出具体文件和目录
            /*java.txt
            javaSE
            javaWeb*/
        }
        System.out.println("--------");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
            if(file.isFile()){
                System.out.println(file);//E:\testFile\java.txt
                System.out.println(file.getName());//java.txt
            }
        }
    }
}

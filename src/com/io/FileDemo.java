package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\testFile\\java.txt");
        System.out.println(f1.createNewFile());//输出：true  ---说明文件创建成功
        /*如果文件不存在，就创建文件，并返回true
​		如果文件存在，就不创建文件，并返回false
        */
        File f2 = new File("E:\\testFile\\javaSE");
        System.out.println(f2.mkdir());//输出：true
        /*如果目录不存在，就创建目录，并返回true
​		如果目录存在，就不创建目录，并返回false*/

        File f3 = new File("E:\\testFile\\javaWeb\\HTML");
        //System.out.println(f3.mkdir());//输出：false --mkdir()方法不能创建多级目录（如果javaWeb文件不存在，不能直接创建HTML文件）
        System.out.println(f3.mkdirs());//输出：true --可创建多级目录
        /*如果多级目录不存在，就创建多级目录，并返回true
​		如果多级目录存在，就不创建多级目录，并返回false*/
    }
}

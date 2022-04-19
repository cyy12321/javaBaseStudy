package com.jihe;
/*思路：
        1. 定义学生类
        2. 创建HashMap集合对象
        3. 创建学生对象
        4. 把学生添加到集合
        5. 遍历集合
            方式1：键值对
            方式2：键值对对象找键和值*/
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapDemo001 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String,Student> hm = new HashMap<String,Student>();
        //创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",35);
        Student s3 = new Student("王祖贤",25);
        //把学生添加到集合
        hm.put("ithem001",s1);
        hm.put("ithem002",s2);
        hm.put("ithem003",s3);
        System.out.println(hm);//{ithem003=com.jihe.Student@1b6d3586, ithem002=com.jihe.Student@4554617c, ithem001=com.jihe.Student@74a14482}
        //方式1：键值对
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
        System.out.println("--------");
        /*ithem003,王祖贤,25
        ithem002,张曼玉,35
        ithem001,林青霞,30
        -------*/
        //方式2：键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
        /*ithem003,王祖贤,25
        ithem002,张曼玉,35
        ithem001,林青霞,30*/
    }
}

package com.jihe;

import java.util.HashMap;
import java.util.Map;

public class BaseMapMethod001 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String, String>();
        //添加元素
        map.put("001","张三");
        map.put("002","lisi");
        map.put("003","wangwu");
        System.out.println(map);//{001=张三, 002=lisi, 003=wangwu}
        //修改元素
        map.put("002","zhaoliu");
        System.out.println(map);//{001=张三, 002=zhaoliu, 003=wangwu}
        //根据键删除键值对元素
        map.remove("002");
        System.out.println(map);//{001=张三, 003=wangwu}
        //判断集合是否包含指定的键
        boolean flag1 = map.containsKey("003");//true
        boolean flag2 = map.containsKey("002");//false
        System.out.println(flag1+","+flag2);

        //判断集合是否包含指定的值
        boolean flag3 = map.containsValue("张三");//true
        System.out.println(flag3);
        //判断集合是否为空
        boolean empty = map.isEmpty();//false
        System.out.println(empty);
        //集合的长度，也就是集合中键值对的个数
        int size = map.size();//2
        System.out.println(size);
        //移除所有的键值对元素
        map.clear();
        System.out.println(map);//{}
        System.out.println(map.isEmpty());//true
        System.out.println(map.size());//0
    }
}

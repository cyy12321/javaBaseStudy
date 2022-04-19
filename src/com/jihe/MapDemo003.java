package com.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo003 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String, String>();
        //添加元素
        map.put("ithem001","张三");
        map.put("ithem002","李四");
        map.put("ithem003","王五");
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> stringEntry : entrySet) {
            //根据键值对对象获取键和值
            String key = stringEntry.getKey();
            String value = stringEntry.getValue();
            System.out.println(key+","+value);
            /*ithem003,王五
            ithem002,李四
            ithem001,张三*/
        }
    }
}

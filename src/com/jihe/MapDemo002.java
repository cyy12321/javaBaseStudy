package com.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo002 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();
        //添加元素
        map.put("ithem001","张三");
        map.put("ithem002","李四");
        map.put("ithem003","王五");
        //获取所有键的集合。用keySet()方法实现
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个键
        for (String key : keySet) {
            //根据键去找值
            String value = map.get(key);
            System.out.println(key+","+value);
            /*输出结果：
            ithem003,王五
            ithem002,李四
            ithem001,张三*/
        }
    }
}

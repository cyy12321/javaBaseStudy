package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo001 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("ithem001","张三");
        map.put("ithem002","李四");
        map.put("ithem003","王五");
        System.out.println(map);//输出：{ithem003=王五, ithem002=李四, ithem001=张三}
        System.out.println(map.get("ithem002"));//李四
        Set<String> keys = map.keySet();
        System.out.println(keys);//输出：[ithem003, ithem002, ithem001]
        Collection<String> values = map.values();
        System.out.println(values);//输出：[王五, 李四, 张三]
    }
}

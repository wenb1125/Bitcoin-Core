package com.btc.rpc.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();//底层的实现数据结构是哈希表
        map.put("name","herixu");
        map.put("age","20");
        map.put("sex","male");

        Set<String> keySet = map.keySet();
        for (String key:keySet
             ) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}

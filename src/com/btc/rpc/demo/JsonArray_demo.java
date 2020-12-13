package com.btc.rpc.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class JsonArray_demo {
    public static void main(String[] args) {
       JSONArray jsonArray = new JSONArray();
       jsonArray.add(getJsonObj("1","bob"));
       jsonArray.add(getJsonObj("2","bob"));
       jsonArray.add(getJsonObj("3","bob"));
       jsonArray.add(getJsonObj("4","bob"));
       String newJsonArray = jsonArray.toJSONString();
        System.out.println(newJsonArray);

    }
    public static JSONObject getJsonObj(String id, String name) {
        JSONObject jsonobj = new JSONObject();
        jsonobj.put(id,name);
        return jsonobj;
    }
}

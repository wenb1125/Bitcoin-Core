package com.btc.rpc.demo;

import com.alibaba.fastjson.JSONObject;

public class Base64_demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = "10001";
        student.name = "老王";
        student.sex = "male";
        student.age = 18;

        String stuJson = JSONObject.toJSON(student).toString();
        System.out.println(stuJson);

        Student stu1 = JSONObject.parseObject(stuJson,Student.class);
        System.out.println(stu1.getName());


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","王二狗");
        jsonObject.put("sex","男");
        jsonObject.put("age","18");
        jsonObject.put("id","1001");
        String jsonString = jsonObject.toJSONString();
        System.out.println(jsonString);
    }

    static class Student {
        private String id;
        private String name;
        private String sex;
        private int age;

        public String getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getSex() {
            return sex;
        }
        public int getAge() {
            return age;
        }
    }
}

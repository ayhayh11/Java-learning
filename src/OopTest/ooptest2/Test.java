package com.example.OopTest.ooptest2;

public class Test {
    public static void main(String[] args) {
        //创建第一个 学生
        Student s1=new Student();
        s1.name="小王";
        s1.sex='男';
        s1.age=18;
        s1.height=170.5;
        System.out.println(s1.name);
        System.out.println(s1.sex);
        System.out.println(s1.age);
        System.out.println(s1.height);
    }
}

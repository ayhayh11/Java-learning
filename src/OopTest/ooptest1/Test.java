package com.example.OopTest.ooptest1;

public class Test {
    public static void main(String[] args) {
        //赋值
        Dog d=new Dog();
        d.name="小黄";
        d.age=5;
        d.color="yellow";
        d.weight=10.5;
        //打印
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.color);
        System.out.println(d.weight);

        //获取第二只小狗
        Dog d2=new Dog();
        d2.name="小黑";
        d2.age=3;
        d2.color="black";
        d2.weight=8.5;
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.color);
        System.out.println(d2.weight);
    }
}

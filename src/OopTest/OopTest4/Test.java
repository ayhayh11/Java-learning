package com.example.OopTest.OopTest4;

public class Test {
    //创建工人的对象
    public static void main(String[] args) {
        Bulider bd=new Bulider();
        bd.name="小王";
        bd.age=18;
        bd.WorkAge=2;
        System.out.println(bd.name);
        System.out.println(bd.age);
        System.out.println(bd.WorkAge);
        bd.work();
    }
}

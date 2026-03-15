package com.example.OopTest.OopTest5;

public class Dog {
    private String name;
    private int age;
    public void setName( String value){
         name=value;
    }
    public String getName(){
         return name;
    }
    public void setAge(int value){
        if(value<0||value>15){
            System.out.println("请输入正确的年龄");
        }
        else {
            age=value;
        }
    }
    public int getAge(){
         return age;
    }
    public void eat(){
        System.out.println(age+"岁的"+name+"正在吃骨头");
    }
}

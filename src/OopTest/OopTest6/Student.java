package com.example.OopTest.OopTest6;

public class Student {
private String name;
private int age;
private double height;
private double weight;
public void setname( String value){
    name=value;
}
public String getName(){
    return name;
}
public void setAge(int value){
    if(value>=0&&value<=100){
        age=value;
    }
    else{
        System.out.println("请输入正确的年龄");
    }
}
public int getAge(){
    return age;
}
public void setHeight(double value){
    height=value;
}
public double getHeight(){
    return height;
}
public void setWeight(double value){
    weight=value;
}
public double getWeight(){
    return weight;
}
public void study(){
    System.out.println(name+"正在努力学习");
}
}

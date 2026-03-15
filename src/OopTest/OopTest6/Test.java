package com.example.OopTest.OopTest6;

public class Test {
    public static void main(String[] args) {
       /* 在校学生有属性:姓名、年龄、身高、体重。行为:学习。
        实现以下需求要求1:大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。
        要求2:大二期间张三体重增加了10kg
        要求3:大三期间张三减肥成功，身高增加2cm，体重减少3kg
        要求4:打印大学毕业之后，张三的所有信息*/
        Student s=new Student();
        s.setname("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
        System.out.println(s.getName()+","+s.getAge()+"岁,"+s.getHeight()+"cm,"+s.getWeight()+"kg");
        s.study();
        //大二胖了10Kg
        s.setAge(s.getAge()+1);
        s.setWeight(s.getWeight()+10);
        System.out.println(s.getName()+","+s.getAge()+"岁,"+s.getHeight()+"cm,"+s.getWeight()+"kg");
        //大三瘦了3Kg，高度增加2cm
        s.setAge(s.getAge()+1);
        s.setHeight(s.getHeight()+2);
        s.setWeight(s.getWeight()-3);
        System.out.println(s.getName()+","+s.getAge()+"岁,"+s.getHeight()+"cm,"+s.getWeight()+"kg");
        //大四
        s.setAge(s.getAge()+1);
        //毕业
        s.setAge(s.getAge()+1);
        System.out.println(s.getName()+","+s.getAge()+"岁,"+s.getHeight()+"cm,"+s.getWeight()+"kg");
    }
}

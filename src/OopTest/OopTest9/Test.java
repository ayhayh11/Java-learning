package OopTest.OopTest9;

public class Test {

    public static void main(String[] args) {
    /*    学生有如下属性:
        姓名，年龄，老师
        一个班级中，所有学生都是共享同一个老师
        第一名学生:
        小诗诗，19 岁
        第二名学生:
        小丹丹，20 岁
        最初都是小雯老师上课，有一天小丹丹申请换老师，换成了小红老师
        利用static模拟上述效果

        关于static需要重点掌握的内容:
        1. 静态变量，被当前类所有的对象共享
        共享:
        赋值只要赋值一次
        只要有一个对象修改了静态变量，其他对象再次访问的时候就是修改之后的结果
        2. 调用方式:
        方式一:
        类名调用(推荐)
        方式二:
        对象名调用*/
        Student.teachername="小文老师";
        Student s1 = new Student();
        s1.name = "小诗诗";
        s1.age = 19;
        Student s2 = new Student();
        s2.name = "小丹丹";
        s2.age = 20;
        s2.teachername = "小红老师";

        System.out.println(s1.name + s1.age + "," + s1.teachername);
        System.out.println(s2.name + s2.age + "," + s2.teachername);
    }
}

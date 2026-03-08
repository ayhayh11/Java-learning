package ifdemo;

import java.util.Scanner;

public class ifdemo3 {
    public static void main(String[] args) {
        //输入一个小数表示考试成绩
//        判断学生成绩是否及格（60及格线）如果及格输出通过，否则输出不通过。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        double score =sc.nextDouble();
        //判断成绩是否合理
       /*方法1
        if(score<0||score>100){
            System.out.println("成绩不合理");
            return;
        }
        boolean result = score>=60;
        if(result){
            System.out.println("通过");
        }
        else {
            System.out.println("不通过");
        }*/
        //方法2
        if(score>0&&score<=100){
            if(score<60){
                System.out.println("不通过");
            }
            else{
                System.out.println("通过");
            }
        }
        else {
            System.out.println("成绩不合理");
        }

    }
}

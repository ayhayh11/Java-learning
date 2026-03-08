package ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args) {
        //定义一个人的体温，是否大于38度，如果大于38度发出警告
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入人的体温：");
        double temp = sc.nextDouble();
        //判断是否大于38度
        if (temp>=38){
            System.out.println("警告！请进行隔离");
        }
    }
}

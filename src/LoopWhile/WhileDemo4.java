package LoopWhile;

import java.util.Scanner;

public class WhileDemo4 {
    public static void main(String[] args) {
     /*   描述
        给定一个整数n，请计算其所有数位之和。若n为负数，请先取其绝对值。
        示例1
        输入:12
        说明:1+2=3
        输出:3
        示例2
        输入:-305
        说明:获取绝对值305，再求和3+0+5=8
        输出:8*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = sc.nextInt();
        int sum = 0;
        if(n<0){
            n=-n;
        }
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}

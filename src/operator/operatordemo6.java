package operator;

import java.util.Scanner;

public class operatordemo6 {
    public static void main(String[] args) {
        //键盘录入一个3位数，能不能被三整除
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个3位数：");
        int num = sc.nextInt();
        boolean result= num % 3 == 0;
        System.out.println(result);

    }
}

package operator;

import java.util.Scanner;

public class operatordemo5 {
    public static void main(String[] args) {
        /*
        输入两人身高，比比谁更高
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个人的身高：");
        double h1 = sc.nextDouble();
        System.out.println("请输入第二个人的身高：");
        double h2 = sc.nextDouble();
        boolean flag = h1 >= h2;
        System.out.println(flag);
    }
}

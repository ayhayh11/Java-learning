package operator;

import java.util.Scanner;

public class operatoedemo7 {
    public static void main(String[] args) {
        //键盘录入一个四位数，判断它是否是回文数
        /*Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个4位数：");
        int num = sc.nextInt();
        //数字拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        System.out.println(qian);
        boolean result = ge == qian && shi == bai;
        System.out.println(result);*/
        //寻找一个7的有缘数，定义一个两位数，只要包含7或是7的倍数，那么这个数就是有缘数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个两位数：");
        int num = sc.nextInt();
        //数字拆分
        int ge = num % 10;
        int shi = num / 10;
        //判断是否有缘数
        boolean result = ge == 7 || shi == 7 || ge * shi == 7;
        System.out.println(result);
    }
}

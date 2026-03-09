package loopfor;

import java.util.Scanner;

public class foedemo5 {
    public static void main(String[] args) {
      /*  键盘录入两个数字表示范围
        统计这个范围内，既能被3整除又能被5整除*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int left = sc.nextInt();
        int right = sc.nextInt();
        int count = 0;
        //获取两个数字中的最大值和最小值
        int max, min;
        max = Math.max(left, right);
        min = Math.min(left, right);
        System.out.println("范围是：" + min + "-" + max);
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        if (count > 0) {
            System.out.println("范围内有" + count + "个数");
        } else {
            System.out.println("范围内没有数");
        }

    }
}

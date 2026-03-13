package test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
      /*  给你两个整数M和N，M表示红包的总额， N表示红包的个数
        现在又N个人来抽红包，每个人都是随机的，打印每个人领的红包金额*/
        int m = 4;
        int n = 5;
        Random r = new Random();
        if (m < n) {
            System.out.println("红包金额不够");
        } else {
            for (int i = 1; i <= n; i++) {
                int min = (n - i);
                int max = m - min;
                int num = r.nextInt(max - min) + 1;
                System.out.println("第" + i + "个人抢到红包" + num);
                m = m - num;
                if (i == n) {
                    System.out.println("第" + i + "个人抢到红包" + m);
                }
            }
            //上述方法不能保证相对公平，第一个永远是大范围，为保持相对公平
            //可以将取值范围变成m/n*2（2可变）
        }
    }
}

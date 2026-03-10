package array;

import java.util.Scanner;

public class arraydemo3 {
    public static void main(String[] args) {
       /* 已知一个数组[33，5，22，44，55，33]；
        键盘录入一个数值，判断该数值是否在数组中；
        如果存在只显示第一次，不存在就输出：不存在！*/
        int[] arr = {33, 5, 22, 44, 55, 33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sc.nextInt();
        //定义一个布尔值如果整个数组否都没有找到，则返回false
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                a = true;
                System.out.println("第" + (i + 1) + "个");
                break;
            }
        }
        if (!a) {
            System.out.println("不存在");
        }
    }
}

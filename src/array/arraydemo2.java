package array;

import java.util.Scanner;

public class arraydemo2 {
    public static void main(String[] args) {
        //键盘录入五个整数，存入数组中，进行遍历
        //数组动态初始化
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数字：");
            int num;
            num=sc.nextInt();
            arr[i]=num;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }
        }
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
}

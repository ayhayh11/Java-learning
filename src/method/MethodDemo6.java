package method;

import java.util.Scanner;

public class MethodDemo6 {
    public static void main(String[] args) {
        /*跳水比赛有五个评委打分，分数在0~100之间。
        最终得分会去掉一个最高分，去掉一个最低分，
        剩余的分数再求平均数，改平均数为选手最终得分。
        要求1:利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
        要求2:定义方法分别求数组的最大值和最小值
        要求3:计算五名评委的总分
        要求4:总分-最大值-最小值，求选手最终平均分*/
        //首先分析定义方法
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的打分(0-100)");
            arr[i]=sc.nextInt();
            if(arr[i]<0||arr[i]>100){
                System.out.println("输入的分数超出范围，请重新输入");
                i--;
            }
        }
        int max=getmax( arr);
        int min=getmin( arr);
        int sum=getSum( arr);
        System.out.println("最大值是"+max);
        System.out.println("最小值是"+min);
        System.out.println("总分是"+sum);
        System.out.println("选手最终得分是"+(sum-max-min)/3.0);

    }
    //取最大值
    public static int getmax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                 max=arr[i];
            }
        }
        return max;
    }
    //最小值
    public static int getmin(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    //求五位评分的和
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}

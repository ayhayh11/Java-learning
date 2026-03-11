package method;

import java.util.Scanner;

public class MethodDemo7 {
    public static void main(String[] args) {
    /*    班主任需要统计10名学生的数学成绩（0-100分），
        计算及格率，平均分，并找出最高分。
        要求1：键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
        要求2：定义方法，求及格人数，根据及格人数，求及格率。
        要求3：定义方法求总分，根据总分求平均分
        要求4：定义方法求最大值。*/
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            double score=sc.nextDouble();
            if(checkScore( score)){
                arr[i]=score;
            }
            else {
                System.out.println("成绩无效，请重新输入");
                i--;
            }
        }
        System.out.println("及格人数是"+getCount( arr));
        System.out.println("及格率是"+(getCount( arr)*1.0/arr.length));
        System.out.println("总分是"+getSum( arr));
        System.out.println("平均分是"+getSum( arr)/arr.length);
        System.out.println("最高分是"+getmax( arr));
    }
    //判断是否超出范围
    public static boolean checkScore(double score){
        if(score>=0&&score<=100){
            return true;
        }else{
            return false;
        }
    }
    //求及格人数
    public static int getCount(double[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=60){
                count++;
            }
        }
        return count;
    }
    //定义方法求总分，根据总分求平均分
    public static double getSum(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //定义方法求最大值
    public static  double getmax(double arr[]){
        double max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

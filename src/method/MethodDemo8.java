package method;

import java.util.Scanner;

public class MethodDemo8 {
    /*需求：
    某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：
    首重1kg：10元；
    超出1-5kg：每kg加2元；
    超出5kg以上：每kg加1.5元。
    键盘录入小数，表示用户快递的重量，计算最终的结果
    要求1：快递重量必须大于0，否则重新输入
    要求2：不同价位的计算，单独定义一个方法*/
    public static void main(String[] args) {
        //输入重量
        Scanner sc=new Scanner(System.in);
        double weight;
        while(true){
            System.out.println("请输入重量：");
             weight=sc.nextDouble();
            boolean check=checkWeight(weight);
            if (check==false){
                System.out.println("请输入正确的重量");
            }
            else
                break;
            }
        double cost=Expresscost(weight);
        System.out.println("运费为："+cost);}



    //定义一个方法，判断重量是否大于0
    public static boolean checkWeight(double weight){
        if(weight<=0){
            return false;
        }
       else return true;
    }
    //定义一个方法来实现不同价位的计算
    public static double Expresscost(double weight){
        double overWeight = weight-1;
        int ceilKg = ceil(overWeight);
        if(weight<=1){
            return 10;
        }
        else if(weight>1&&weight<=5){
            return 10+(ceilKg)*2;
        }
        else{
            return 10+2*4+(ceilKg)*1.5;
        }
    }
    //小数向上取整
    public static int ceil(double overweight){
        if(overweight%1==0){
            return (int)overweight;
        }
        else{
            return (int)(overweight+1);
        }
    }
}

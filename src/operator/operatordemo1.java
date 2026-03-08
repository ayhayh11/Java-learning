package operator;

public class operatordemo1 {
    public static void main(String[] args) {
        //练习1：
        byte a = 10;
        short b = 20;
        double c = 30.5;
        //下面代码在计算的时候，类型转换的情况
       /* 1.a+b
        a+b把a和b转换成int
        结果是300（int）
        2.a+b+c
        将300（int）转换成 double类型
        */
        double result = a+b+c;
        System.out.println(result);


    }
}

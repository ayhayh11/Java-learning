package LoopDoWhile;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        //基本不用，熟悉就好
        //输出五行hello world
        //特点：先执行，后判断，循环体至少执行1次；
        int i=1;
        do{
            System.out.println("Hello World");
            i++;
        }while(i<=5);
    }
}

package LoopWhile;

public class WhileDemo2 {
    public static void main(String[] args) {
      /*  假设你在银行投资100000元，银行给出的复利是1.7%，
        问多少年后可以实现本金翻倍；
        问：你用什么循环呢，代码如何实现呢？*/
        double mon=100000;
        double mon2=2*mon;
        int year=0;
        while (mon<=mon2){
            mon=mon+mon*0.017;
            year++;
        }
        System.out.println("实现本金翻倍需要"+year+"年");
    }
}

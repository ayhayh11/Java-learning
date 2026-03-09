package LoopWhile;

public class WhileDemo3 {
    public static void main(String[] args) {
        /*世界最高峰8848.86米=8848860毫米；
        假如我有一个0.1毫米的纸，需要折叠多少次才能实现最高峰高度？

          */
        int height=8848860;
        double paper=0.1;
        int count=0;
        while (paper<height){
            paper=paper*2;
            count++;
        }
        System.out.println(count);
    }
}

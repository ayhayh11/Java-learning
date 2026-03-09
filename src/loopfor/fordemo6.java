package loopfor;

public class fordemo6 {
    public static void main(String[] args) {
      /*  有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，
        请问第10项的数字是多少?
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...*/
        int a=0;
        int b=1;
        int c=0;
        //每次写for之前要先想好三个问题：开始条件，结束条件，循环体；
        for (int i=3;i<=10;i++){
            c=a+b;
            a=b;//将a,b后移一位
            b=c;
            System.out.println(c);
        }
        System.out.println("第10项的数字是："+c);
    }
}

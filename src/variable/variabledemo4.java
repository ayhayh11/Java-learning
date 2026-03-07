package variable;

public class variabledemo4 {
    public static void main(String[] args) {
        /*定义八种类型的变量
        整数：byte,short,int,long
        浮点: float,double
        布尔: boolean
        字符: char*/
        //1.定义一个byte
        byte a = 127;
        System.out.println(a);
        //2.定义一个short
        short b = 32767;
        System.out.println(b);
        //3.定义一个int
        int c = 2147483647;
        System.out.println(c);
        //4.定义一个long
        //注意：long类型后面必须加L,可大写可小写，方便区分建议大写。
        long d = 9223372036854775807L;
        System.out.println(d);
        //5.定义一个float
        //注意：float类型后面必须加F,可大写可小写，方便区分建议大写。
        float e = 3.14F;
        System.out.println(e);
        //6.定义一个double
        double f = 3.14;
        System.out.println(f);
        //7.定义一个boolean
        boolean g = true;
        System.out.println(g);
        //8.定义一个char
        char h = '大';
        System.out.println(h);

    }
}

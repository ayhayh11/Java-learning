package method;

public class MethodDemo4 {
    public static void main(String[] args) {
        //定义一个方法实现99乘法表

       chengfa();
    }
    public static  void  chengfa(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}

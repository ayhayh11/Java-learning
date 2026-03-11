package method;

public class MethodDemo1 {
    public static void main(String[] args) {
        /*练习：定义一个方法，求两个数的和
        格式：public static 返回值类型int getSum(int a,int b所需要的参数){
               方法体；
               return 返回值;
               注意：方法和方法是平级的不能嵌套
               方法不会主动运行，需要调用
               调用是小括号里，参数个数和类型要一一对应
        }
        */
        int add=getsum(10,20);
        System.out.println(add);

    }
    public  static  int getsum(int a,int b){
         int sum=a+b;
         return sum;
    }
}

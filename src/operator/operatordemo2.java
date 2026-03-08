package operator;

public class operatordemo2 {
    public static void main(String[] args) {
        //练习2:
        //检查下面代码是否会报错，说明原因
                short s1=100;
                short s2=200;
                //short类型会被提升为Int类型
               // byte result=s1+s2;
               //修改方式1(强制降级会导致数据失准)
                byte result=(byte)(s1+s2);
                //修改方式2
                 int result1=s1+s2;

                System.out.println(result);
                System.out.println(result1);
    }
}

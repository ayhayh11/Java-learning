package loopfor;

public class fordemo4 {
    public static void main(String[] args) {
        /*在开发中，如果需要获取一个范围数据，可以使用for循环
        但如果我只想要特定数据，就要用到其他语句结合使用；
        求1-100的偶数的和*/
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum=sum+i;
            }
            else {
                continue;
            }
        }
        System.out.println("1-100的偶数和为"+sum);
    }
}

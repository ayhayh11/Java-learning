package loopfor;

public class fordemo3 {
    public static void main(String[] args) {


    /*在开发中，如果需要获取一个范围数据，可以使用for循环
    求1-5的和*/
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum=sum +i;
        }
        System.out.println("1-5数字和为"+sum);
    }
}

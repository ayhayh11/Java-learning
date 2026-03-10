package array;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //定义一个递增数组，去除其中重复的数据
        int[] arr=new int[]{1,1,1,2,2,3,3,4,4};
        //利用快慢指针
        /*1.当慢指针和快指针的数值相等时，快指针++，去下一个位置；
        2.当慢指针和快指针的数值不相等时，慢指针++，将快指针的数值赋给慢指针的位置；
        同时快指针++*/
        int slow=0;
        int fast=1;
        while (fast<arr.length){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
            fast++;
        }
        for (int i = 0; i <= slow; i++) {
            System.out.println(arr[i]);
        }
    }
}

package array;

import java.util.Arrays;
import java.util.Random;

public class arraydemo5 {
    public static void main(String[] args) {
     /*   需求:已知数组元素为{8,6,37,1,9,10}要求:打乱数组中的数据
        思路:
        第一步:
        0索引上的数据，跟随机位置上的数据进行交换第二步:
        从第二步开始，重复上面的过程
                I
        细节1:
        如何交换两个位置上的数据细节
        2:如何获取一个随机的素引
    */
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //不用循环直接输出数组可以采用Arrays.toString()
        System.out.println(Arrays.toString(arr));
    }
}

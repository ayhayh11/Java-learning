package method;

import java.util.Random;

public class MethodDemo2 {
    public static void main(String[] args) {
//获取是个1-100之间的随机数并存入数组中，要求数据唯一；
        int arr[] = new int[10];
        Random r = new Random();


        for (int i = 0; i < arr.length; ) {
            int a = r.nextInt(100) + 1;
            boolean flag=cantains(a, arr);
            if (!flag) {
                arr[i] = a;
                i++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean cantains(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }
}

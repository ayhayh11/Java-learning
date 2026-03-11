package array;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
      /*  给你两个有序数组arr1和arr2将两个数组中的数据合并到一个大数组中。
        要求:
        合并之后的大数组也是有序的
        举例1:
        arr1:
        13579 .
        arr2:
        246810
        arr3:
        12345678910*/
        int[] arr1 = new int[]{1, 3, 5, 7, 9};
        int[] arr2 = new int[]{2, 4, 6, 8, 10, 11};
        int[] arr3 = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (p1 <= arr1.length - 1 && p2 <= arr2.length - 1) {
                if (arr1[p1] < arr2[p2]) {
                    arr3[i] = arr1[p1];
                    p1++;
                } else {
                    arr3[i] = arr2[p2];
                    p2++;
                }
            } else if (p1 <= arr1.length - 1) {
                arr3[i] = arr1[p1];
                p1++;
            } else if (p2 <= arr2.length - 1) {
                arr3[i] = arr2[p2];
                p2++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}


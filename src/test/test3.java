package test;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        /*给定两个正序数组 arr1和 arr2，请先合并数组，并找出合并之后数组的中位数。
        举例：
        1 2 3 4 5 6 7 8 9      中位数：5
        1 2 3 4 5 6           中位数： （ 3 + 4 ） / 2*/
        int[] arr1 = {1, 3, 4, 5, 7, 9};
        int[] arr2 = {2, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < arr3.length; i++) {
            if(index1==arr1.length){
                arr3[i]=arr2[index2];
                index2++;
                continue;
            }
            if(index2==arr2.length){
                arr3[i]=arr1[index1];
                index1++;
                continue;
            }
            if(arr1[index1]<arr2[index2]){
                arr3[i]=arr1[index1];
                index1++;
            }
            else{
                arr3[i]=arr2[index2];
                index2++;
            }

        }
        //取中位数
        int num;
        if(arr3.length%2==0){
             num=(arr3[arr3.length/2]+arr3[arr3.length/2-1])/2;
        }
        else{
             num=arr3[arr3.length/2];
        }
        System.out.print(Arrays.toString(arr3));
        System.out.println(num);
    }
}

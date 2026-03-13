package test;

import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
   /*     给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
        计算按此排列的柱子，下雨之后能接多少雨水
        输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
        输出：6
        解释：下面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，
        在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）*/
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int max = 0;
        int[] leftlook = new int[arr.length];
        int[] rightlook = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                leftlook[i] = max;
            } else {
                leftlook[i] = max;
            }
        }
        max=0;
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                rightlook[i] = max;
            } else {
                rightlook[i] = max;
            }
        }
  //取交集
        int result[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(leftlook[i]<=rightlook[i]){
                result[i]=leftlook[i];
            }
            else{
                result[i]=rightlook[i];
            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            result[i]=result[i]-arr[i];
            sum=sum+result[i];
        }
        System.out.println(sum);
    }
}

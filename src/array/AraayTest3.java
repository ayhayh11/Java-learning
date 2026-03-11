package array;

import java.util.Arrays;
import java.util.Scanner;

public class AraayTest3 {
    public static void main(String[] args) {
       /* 给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
       如果目标值不存在于数组中，打印应插入的位置
        举例1:
        数据:nums=[1,3,5,6];target = 5
        输出:2
        举例2:
        数据:nums= [1,3,5,6], target= 2
        输出:1
        举例3:
        数据: nums =[1,3,5,61, target=7*/
        int[] num = {1, 3, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int target = sc.nextInt();
        int count = 0;
        int a = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println(i);
                count++;
                break;
            }
        }
        if (count == 0) {
            int[] newnum = new int[num.length + 1];
            for (int j = 0; j < num.length; j++) {
                newnum[j] = num[j];
            }
            newnum[newnum.length - 1] = target;
            for (int x = 0; x < newnum.length - 1; x++) {
                for (int y = 0; y < newnum.length - 1 - x; y++) {
                    if (newnum[y] >= newnum[y + 1]) {
                        a = newnum[y];
                        newnum[y] = newnum[y + 1];
                        newnum[y + 1] = a;
                    }
                }

            }
            System.out.println(Arrays.toString(newnum));

        }
    }
}


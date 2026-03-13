package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test6 {
    /* 彩票大乐透规则：
      前区1-35选取五个数字，不能重复
      后区1-12选取两个数字，不能重复
      跨区可重复
              中奖规则：
      一等将：5+2
      二等将：5+1
      三等将：5+0/4+2
      四等将：4+1/3+2
      五等将：4+0/3+1/2+2
      六等将：3+0/1+2/2+1/0+2*/
    public static void main(String[] args) {
        //1.随机生成彩票
        //2.键盘输入购买彩票
        //3.是否获奖
        //1.随机生成彩票
        int[] lotto = createlotto();
        System.out.println(Arrays.toString(lotto));
        int[] buy = buylotto();
        System.out.println(Arrays.toString(buy));
        winner(lotto, buy);
    }

    //创建彩票
    public static int[] createlotto() {
        int[] arr = new int[7];
        Random r = new Random();
        // 生成前区号码
        for (int i = 0; i < 5; ) {
            int number = r.nextInt(0, 36);
            boolean flag = contains(arr, number, 0, 4);
            if (!flag) {
                arr[i] = number;
                i++;
            }
        }
        //生成后区号码
        for (int i = 0; i < 2; ) {
            int number = r.nextInt(0, 13);
            boolean flag = contains(arr, number, 5, 6);
            if (!flag) {
                arr[i + 5] = number;
                i++;
            }
        }
        return arr;
    }

    //键盘输入彩票
    public static int[] buylotto() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 5; ) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            int number = sc.nextInt();
            if (number < 0 || number > 36) {
                System.out.println("输入的数字超出范围，请重新输入");
                continue;
            }
            boolean flag = contains(arr, number, 0, 4);
            if (flag) {
                System.out.println("号码重复，请重新输入");
                continue;
            }
            arr[i] = number;
            i++;
        }
        for (int i = 0; i < 2; ) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            int number = sc.nextInt();
            boolean flag = contains(arr, number, 5, 6);
            if (number < 0 || number > 13) {
                System.out.println("输入的数字超出范围，请重新输入");
                continue;
            }
            if (flag) {
                System.out.println("号码重复，请重新输入");
                continue;
            }
            arr[i + 5] = number;
            i++;
        }
        return arr;
    }

    //中奖号码个数
    public static int checklotto(int[] arr1, int[] arr2, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = contains(arr1, arr2[i], start, end);
            if (flag) {
                count++;
            }
        }

        return count;
    }

    //几等奖
    public static void winner(int[] arr1, int[] arr2) {
        int count1 = checklotto(arr1, arr2, 0, 4);
        int count2 = checklotto(arr1, arr2, 5, 6);
        if (count1 == 5 && count2 == 2) {
            System.out.println("恭喜中一等奖");
        } else if (count1 == 5 && count2 == 1) {
            System.out.println("恭喜中二等奖");
        } else if (count1 == 5 && count2 == 0 || count1 == 4 && count2 == 2) {
            System.out.println("恭喜中三等奖");
        } else if (count1 == 4 && count2 == 1 || count1 == 3 && count2 == 2) {
            System.out.println("恭喜中四等奖");
        } else if (count1 == 4 && count2 == 0 || count1 == 3 && count2 == 1 || count1 == 2 && count2 == 2) {
            System.out.println("恭喜中五等奖");
        } else if (count1 == 3 && count2 == 0 || count1 == 2 && count2 == 1 || count1 == 1 && count2 == 2 || count1 == 0 && count2 == 2) {
            System.out.println("恭喜中六等奖");
        } else {
            System.out.println("未中奖");
        }

    }

    //判断号码是否重复
    public static boolean contains(int[] arr, int number, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}

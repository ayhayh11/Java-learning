package array;

public class arraytest1 {
    //给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target 的那两个整数，并输出它们的数组索引。
    //提示:先不用考虑效率问题，两层循环即可完成
    //要求1:只要输出第一对满足要求的情况
    //要求2:输出所有满足要求的情况
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15, 3, 6};
        int target = 9;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    count++;
                    System.out.println(i + " " + j);
                    return;//输出第一对满足要求,需求二直接停止就可以
                }
            }
        }
        if (count == 0) {
            System.out.println("没有满足要求的数");
        }
    }
}


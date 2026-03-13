package test;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        /*学校选举学生会主席，有5个候选人
        全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。
        投票使用Random模拟。0：弃权，1 ~ 5：给对应的候选人投票
        要求1：
        统计每个候选人的得票数和得票率，找出得票最多的候选人？
        要求2：
        统计弃票数和弃票率是多少？*/
        int[] arr = new int[6];
        Random r = new Random();
        //生成随机数，填入数组中
        for (int i = 0; i < 1000; i++) {
            int num = new Random().nextInt(6);
            arr[num]++;
        }
        //找出得票最多的候选人
        int max = arr[1];
        int maxindex=1 ;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxindex = i;
            }
        }
        // 统计每个候选人的得票数和得票率
        for (int i = 1; i < arr.length; i++) {
            System.out.print("第" + i + "个候选人的得票数是" + arr[i]+"  ");
            System.out.println("得票率是" + arr[i] *1.0/ 1000.0*100+"%");
        }
        System.out.println("第" + maxindex + "个候选人得票数最多");
        //统计弃票数和弃票率是多少？
        System.out.println("弃票数是" +  arr[0]+"  弃票率是" + arr[0] *1.0/ 1000.0*100+"%");
    }
}

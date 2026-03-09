package loopfor;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class ForDemo7 {
    public static void main(String[] args) {
        /*小明开始学习数列了，现在他想计算前n项的和；
        s(n)=1-2+3-4+5-6+7-8+9-10.....
        示例：输入4
        说明：s(4)=1-2+3-4
        输出：-2
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sum = sum - i;
            else sum = sum + i;

        }
        System.out.println("前"+n+"项和为"+sum);
    }
}

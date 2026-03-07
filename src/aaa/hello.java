package aaa;

import java.util.Scanner;

public class hello {
    //写一个彩票系统生成随机7位数字，让用户写入7为数字，判断用户输入的数字和系统生成的数字是否相同
    //1.生成7位随机数字,数字可为0-9，数字不要显示出来，只显示数字
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        
        //2.用户输入 7 位数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 7 位数字：");
        String input = sc.nextLine();
        int[] userInput = new int[7];
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = input.charAt(i) - '0';
        }
        
        //3.判断用户输入的数字和系统生成的数字是否相同
        boolean isSame = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != userInput[i]) {
                isSame = false;
                break;
            }
        }
        
        if (isSame) {
            System.out.println("恭喜你，中奖了！");
        } else {
            System.out.println("很遗憾，没有中奖。");
        }
    }
}

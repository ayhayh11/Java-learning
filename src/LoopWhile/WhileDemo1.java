package LoopWhile;

public class WhileDemo1 {
    public static void main(String[] args) {
        //用while实现游戏：连跳10次
        /*格式
                while(条件判断语句){
                   循环体：重复执行的代码
                    条件控制语句：控制循环的结束

          }
          */
        int i=1;
        while (i<=10){
            System.out.println("跳跃了"+i+"次!");
            i++;
        }
    }
}

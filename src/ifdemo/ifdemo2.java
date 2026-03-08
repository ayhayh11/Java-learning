package ifdemo;

import java.util.Scanner;

public class ifdemo2 {
    public static void main(String[] args) {
        //一个人物血量200点，当他收到x伤害时，技能恢复y点血，人物不会死亡，最少剩余一点血，最终人物血量多少血？
        //录入伤害和恢复
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入照成伤害");
        System.out.println("请输入技能恢复血量");
        int x=sc.nextInt();
        int y=sc.nextInt();
        //x和y不能是负数
        if(x<0||y<0){
            System.out.println("输入的数值不能小于0");
            return;
        }
//        定义人物最大血量200
        int hp=200;
        //计算血量
        hp=hp-x;
        if(hp<=0){
            hp=1;
        }
        System.out.println("当前血量是"+hp);
        hp=hp+y;
        if(hp>=200){
            hp=200;
        }
        System.out.println("最终血量是"+hp);
    }
}

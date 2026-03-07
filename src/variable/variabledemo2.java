package variable;

public class variabledemo2 {
    public static void main(String[] args) {
        /*我方:叉子     对方:长手
        攻击:220        攻击:210
        防御:85         防御:80
        血量:1012.5     血量:1223.3
        技能加成:1.2    技能加成:1.3
        技能造成伤害的公式:攻击力技能加成一对方防御力
                普攻造成伤害的公式攻击力一对方防御力
 计算:
我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量?
我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量?*/
        //定义我方所有变量
        int attack = 220;
        int defense = 85;
        double health = 1012.5;
        double skillAdd = 1.2;
        //定义对方所有变量
        int attack2 = 210;
        int defense2 = 80;
        double health2 = 1223.3;
        double skillAdd2 = 1.3;
        //计算第一次普通攻击伤害和对方剩余血量
        double damage1 = attack-defense2;
        health2 = health2 - damage1;
        System.out.println("对方血量"+health2);
        //计算第二次技能攻击伤害和对方剩余血量
        double damage2 = attack*skillAdd-defense2;
        health2 = health2 - damage2;
        System.out.println("对方剩余血量"+health2);
    }
}

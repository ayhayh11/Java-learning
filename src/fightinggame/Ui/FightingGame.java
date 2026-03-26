package fightinggame.Ui;

import fightinggame.domain.EnemyCharacter;
import fightinggame.domain.HeroCharacter;
import fightinggame.domain.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FightingGame {
    public void gamestart(String username) {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("      🎮 欢迎" + username + "来到英雄之塔🎮        ");
        System.out.println("╚════════════════════════════════╝");
        //创建玩家对象
        HeroCharacter player = createHeroCharacter(username);
        //显示角色属性
        System.out.println("角色创建成功！\uD83D\uDC4C");
        System.out.println("您的初始属性为：");
        player.show();
        System.out.println("您的技能：" + player.showskill());
        //创建敌人对象
        /*初级战士  80   15   10 猛击（150%伤害）                                       |
        敏捷刺客  60   20   5  快速攻击（2次50%伤害）                                 |
        重装坦克  120  10   20 防御姿态（下回合伤害减半） buff（ boolean buff） |
        神秘法师  70   25   8  火球术（180%伤害）*/
        ArrayList<EnemyCharacter> enemyList = new ArrayList<>();
        enemyList.add(new EnemyCharacter("哥布林战士", 80, 15, 10, "撞击"));
        enemyList.add(new EnemyCharacter("人族刺客", 60, 20, 5, "快速攻击"));
        enemyList.add(new EnemyCharacter("兽人坦克", 120, 10, 20, "防御姿态"));
        enemyList.add(new EnemyCharacter("亡灵法师", 70, 25, 8, "火球术"));
        int count = 1;
        int wins = 0;
        while (player.isAlive()) {
            //开始战斗
            if (count > 1) {
                for (int i = 0; i < enemyList.size(); i++) {
                    EnemyCharacter c = enemyList.get(i);
                    c.maxhp=c.maxhp + 10;
                    c.setHp(c.getMaxhp());
                    c.setAttack(c.getAttack() + 3);
                    c.setDefense(c.getDefense() + 1);
                    c.buff = false;
                }
            }
            Random r = new Random();
            int index = r.nextInt(enemyList.size());
            EnemyCharacter enemy = enemyList.get(index);
            enemy.show();
            //战斗开始
            System.out.println("_______________________________________");
            System.out.println("⚔\uFE0F第" + count + "场战斗开始！对手：" + enemy.getName());
            int round = 1;//第n轮的第多少回合
            while (player.isAlive()) {
                System.out.println("________________________");
                System.out.println("⚔\uFE0F第" + round + "回合开始！对手：" + enemy.getName());
                //打印血条
                System.out.println(getHpBar(player.getName(), player.getHp(), player.getMaxhp()));
                System.out.println(getHpBar(enemy.getName(), enemy.getHp(), enemy.getMaxhp()));
                //玩家行动（1.普通攻击，2.自爆-10hp，3.吸血）
                playerTurn(player, enemy);
                if (!enemy.isAlive()) {
                    System.out.println("恭喜你，你赢了" + enemy.getName());
                    wins++;
                    break;
                }
                //敌人行动
                // - 5.6 敌人回合：选择行动（ 50%的几率普通攻击 / 50%的几率技能攻击 / 不同的敌人采取不同的技能进行攻击）
                //   - 5.7 判断玩家是否被击败（判断玩家血量是否为0）
                enemyTurn(enemy, player);
                if (!player.isAlive()) {
                    System.out.println("☠️☠️☠️☠️你死于"+enemy.getName()+"！☠️☠️☠️☠️");
                    break;
                }
                round++;

            }
            //战斗结束后，胜利继续战斗，失败停止；
            if(player.isAlive()){
                int healHp = r.nextInt(21)+20;
                player.heal(healHp);
                System.out.println("❤️战斗结束，你获得"+healHp+"点生命值！");
                System.out.println("🏆🏆当前胜场"+wins);
                System.out.println("_______________________________________");
            }
            //胜利三场就增加属性
            if (player.isAlive()&&wins!=0&&wins % 3==0) {
                System.out.println("🏆🏆恭喜你，level up！");
                player.setMaxhp(player.getMaxhp() + 30);
                player.setAttack(player.getAttack() + 5);
                player.setDefense(player.getDefense() + 3);
                System.out.println("属性提升成功！生命+30，攻击+5，防御+3");
                player.show();
            }
            //询问是否继续
            if(player.isAlive()){
                System.out.println("是否继续战斗？(yes/no)");
                Scanner sc = new Scanner(System.in);

                boolean vaildInput = false;
                while (!vaildInput) {
                    String choose = sc.next();
                    if ("yes".equalsIgnoreCase( choose)) {
                        count++;
                        vaildInput = true;
                    } else if("no".equalsIgnoreCase( choose)){
                        System.out.println("游戏结束！");
                        vaildInput = true;
                        break;
                    }
                    else{
                        System.out.println("输入错误，请重新输入");
                    }
                }
            }

        }
        //游戏结束
        System.out.println("===============================");
        System.out.println("游戏结束！");
        System.out.println("感谢你的游玩");
        System.out.println("总胜场数：" + wins);
        System.exit(0);


    }

    //创建英雄角色

    //参数用户名
    //返回值结果
    //定义一个方法打印血条
    public String getHpBar(String name, int hp, int maxhp) {
        int barlength = 20;
        int field = (int) (hp * 1.0 / maxhp * barlength);
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");
        for (int i = 0; i < barlength; i++) {
            if (i < field) {
                sb.append("█");
            } else {
                sb.append(" ");
            }
        }
        sb.append("]").append(hp).append("/").append(maxhp).append("hp");
        return sb.toString();
    }

    public HeroCharacter createHeroCharacter(String username) {
        System.out.println("创建您的角色：");
        System.out.println("您的角色名称：" + username);
        int points = 20;
        System.out.println("请分配属性点（20点）");
        System.out.println("生命值（每点加10hp）");
        System.out.println("攻击力（每点加2攻击）");
        System.out.println("防御力（每点加1防御）");
        Scanner sc = new Scanner(System.in);
        String[] attritubes = {"生命", "攻击", "防御"};
        int[] arr = new int[3];
        for (int i = 0; i < attritubes.length; i++) {
            System.out.println("加点给" + attritubes[i] + "（剩余点数：" + points + ")");
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println("谁让你输负数的，给你变成0");
                input = 0;
            }
            if (input > points) {
                System.out.println("你输入的点数超过剩余点数，给你变成全部点数");
                input = points;
            }
            points -= input;
            arr[i] = input;
        }
        HeroCharacter player = new HeroCharacter(
                username,
                100 + arr[0] * 10,
                10 + arr[1] * 2,
                0 + arr[2] * 1
        );
        player.skillList.add("平A");
        player.skillList.add("自爆");
        player.skillList.add("吸血");

        return player;
    }

    //玩家回合
    public void playerTurn(HeroCharacter player, EnemyCharacter enemy) {
        System.out.println("========你的回合========");
        System.out.println("1：平A");
        System.out.println("2：自爆");
        System.out.println("3：吸血");
        System.out.println("请选择你的技能：");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        switch (choice) {
            default:
                System.out.println("没有这个操作默认使用平A");
            case "1":
                int damage1 = calculateDamage(player.getAttack(), enemy.getDefense());
                // 你对   使用了，造成  点伤害！
                System.out.println("⚔️ 你对" + enemy.getName() + "使用了平A，造成" + damage1 + "点伤害！");
                enemy.takedamage(damage1);
                break;
            case "2":
                if (player.getHp() > 10) {
                    player.takedamage(10);
                    int damage2 = calculateDamage((int) (player.getAttack() * 1.8), enemy.getDefense());
                    System.out.println("\uD83D\uDCA5 你对" + enemy.getName() + "使用了自爆，造成" + damage2 + "点伤害！");
                    enemy.takedamage(damage2);
                } else {
                    System.out.println("体力不足，自爆失败");
                }
                break;

            case "3":
                if (player.getHp() > 10) {
                    player.takedamage(10);
                    Random r = new Random();
                    int healhp = r.nextInt(21);
                    player.heal(healhp);

                    int damage3 = calculateDamage(healhp, enemy.getDefense());
                    enemy.takedamage(damage3);
                    System.out.println("💉💉消耗了10hp" + "你吸取了" + healhp + "点血并造成了" + damage3 + "点伤害");
                }
                break;


        }
    }

    //敌人回合
    public void enemyTurn(EnemyCharacter enemy, HeroCharacter player) {
        System.out.println("========" + enemy.getName() + "的回合========");
        String action = "普通攻击";
        Random r = new Random();
        int num = r.nextInt(10);
        if (num >= 5) {
            action = enemy.skill;
        }
        switch (action) {
            case "普通攻击":
                System.out.println(enemy.getName() + "使用了普通攻击");
                int damage1 = calculateDamage(enemy.getAttack(), player.getDefense());
                System.out.println("⚔️ " + enemy.getName() + "对你使用了普通攻击，造成" + damage1 + "点伤害！");
                player.takedamage(damage1);
                break;
            case "撞击":
                System.out.println(enemy.getName() + "使用了撞击");
                int damage2 = calculateDamage((int) (enemy.getAttack() * 1.5), player.getDefense());
                System.out.println("⚔️ " + enemy.getName() + "对你使用了撞击，造成" + damage2 + "点伤害！");
                player.takedamage(damage2);
                break;
            case "快速攻击":
                System.out.println(enemy.getName() + "使用了撞击");
                int damage3 = 0;
                for (int i = 0; i < 2; i++) {
                    int temp = calculateDamage(enemy.getAttack()/2, player.getDefense());
                    damage3 += temp;
                }
                System.out.println("⚔️ " + enemy.getName() + "对你使用了快速攻击，造成" + damage3 + "点伤害！");
                player.takedamage(damage3);
                break;
            case "防御姿态":
                System.out.println(enemy.getName() + "使用了撞击");
                enemy.buff=true;
                System.out.println("🛡️🛡️"+enemy.getName()+"摆出了防御姿态");
                break;
            case "火球术":
                System.out.println(enemy.getName() + "使用了撞击");
                int damage4 = calculateDamage((int) (enemy.getAttack() * 1.8), player.getDefense());
                System.out.println("🔥🔥 " + enemy.getName() + "对你使用了火球术，造成" + damage4 + "点伤害！");
                player.takedamage(damage4);
                break;
        }

    }

    //普通攻击计算伤害方法（attack,enemy.defense）
    //技能攻击(attack*1.8,enemy.defense)
    public int calculateDamage(int attack, int defense) {
        int damge = attack - defense;
        if (damge < 1) {
            damge = 1;
        }
        return damge;
    }


}

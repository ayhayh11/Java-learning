package fightinggame.domain;

public class Character {
     String name;
     int hp;
     public int maxhp;
     int attack;
     int defense;

    public Character(int attack, int defense, int hp, String name) {
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.maxhp = hp;
        this.name = name;
    }

    public Character() {
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //判断人物是否存活
    public boolean isAlive() {
        return hp > 0;
    }

    //恢复血量
    public void heal(int amount) {
        hp += amount;
        if (hp > maxhp) {
            hp = maxhp;
        }
    }

    //受伤扣血
    public void takedamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
        }
    }
//展示人物属性值
    public void show() {
        System.out.println("名称:" + name +"  血量:" + hp+ "  攻击:" + attack + "  防御:" + defense );
    }
}

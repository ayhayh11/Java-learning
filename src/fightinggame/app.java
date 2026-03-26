package fightinggame;

import fightinggame.Ui.FightingGame;
import fightinggame.Ui.login;

public class app {
    public static void main(String[] args) {
        //启动类，只负责启动游戏
        //启动注册界面
        login l = new login();
        l.start();


    }
}

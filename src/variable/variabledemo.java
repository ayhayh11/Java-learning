package variable;

public class variabledemo {
    public static void main(String[] args) {
/*    微信余额有0元
    支付宝有10元
    银行卡有20元
    问题1：请问我一共有多杀钱
    问题2：我收了20红包，又给我室友发了2元红包，我还有多少钱？*/
        //微信余额0元
        double a = 0;
        //支付宝余额10元
        double b = 10;
        //银行卡余额20元
        double c = 20;
        //微信收了十元红包
        a = a + 10;
        //微信发了2元红包
        a = a - 2;
        System.out.println("微信余额"+a);
        //现在我有多少钱
        System.out.println("现在我有" + (a + b + c) + "元");
        }

    }

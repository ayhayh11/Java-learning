package operator;

public class operatordemo3 {
    public static void main(String[] args) {
        //实现字母A到a的转换
        char c = 'A';
        //1.把A转换成ASCII码（ASCII码（十进制）字母大写+32变为小写）
        //再将Int类型强制转换成char类型
        char cc =(char)(c+32);
        System.out.println(cc);
    }
}

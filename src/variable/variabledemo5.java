package variable;

public class variabledemo5 {
    public static void main(String[] args) {
        //BMI=体重/身高的平方
        //1.定义身高和体重
        double height = 1.76;
        double weight = 106.5;
        //2.计算BMI
        double bmi = weight / ( height * height);
        System.out.println("BMI="+bmi);
        //扩展：在现在的身高条件下，在标准 bmi 范围内，最大体重是多少？
        // 标准 BMI 范围：18.5-23.9
        double minbmi = 18.5;
        double maxbmi = 23.9;
            
        // 最大体重 = 最大 BMI × 身高的平方
        double maxweight = maxbmi * (height * height);
        System.out.println("最大体重="+maxweight);

    }
}

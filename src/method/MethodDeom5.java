package method;

public class MethodDeom5 {
    public static void main(String[] args) {
        //定义两个长方形，比较两个长方形的面积大小
        double height1=10.3;
        double width1=5.6;
        double height2=8.2;
        double width2=6.4;
        double area1=getArea(height1,width1);
        double area2=getArea(height2,width2);
        if(area1>area2){
            System.out.println("第一个长方形面积"+area1+"大于第二个长方形面积"+area2);
        } else if (area2>area1) {
            System.out.println("第二个长方形面积"+area2+"大于第一个长方形面积"+area1);
        }else{
            System.out.println("两个长方形面积相等");
        }
    }
    public static double getArea(double height,double width){
        return height*width;
    }
}

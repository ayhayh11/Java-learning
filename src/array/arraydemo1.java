package array;

public class arraydemo1 {
    public static void main(String[] args) {
        /*1.定义数组储存三个同学的年龄
        2.定义数组储存三个同学的身高
        3.定义数组储存三个同学的姓名*/
        int ageArr[]=new int[]{18,21,23};
        double heightArr[]={1.66,1.92,1.83,1.64,1.76};
        String nameArr[]={"小王","小李","小张"};
        //获取数组的元素
        //数组中利用索引来获取元素，0-n；索引从0开始
        int a=ageArr[2];
        System.out.println(a);
        //修改数组元素
        ageArr[0]=20;
        System.out.println(ageArr[0]);
        //数组的遍历
        for(int i=0;i<ageArr.length;i++){
            System.out.println(ageArr[i]);
        }
        //快速生成数组用arr.fori
        /*for (int i = 0; i < ageArr.length; i++) {

        }*/
    }
}

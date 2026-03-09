package loopfor;

public class fordemo2 {
   /* 在实际开发中，如果需要获取一个范围的数据，可以使用for循环
    需求1：打印1-5；
    要求2；打印5-1；*/
    public static  void  main(String[] args){
        //需求1
       /* for(int i=1;i<=5;i++){
            System.out.println(i);
        }*/
        // 需求2
        for(int i=5;i>=1;i--){
            System.out.println(i);
        }
    }
}

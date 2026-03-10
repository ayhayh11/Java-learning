package array;

import java.util.Random;

public class Arraydemo6 {
    public static void main(String[] args) {
        /*获取十个1-100的随机数，并存入数组中，要求数组中不能有重复的数字。*/
        //生成一个长度10的数组
        //那我要把范围取到0-100呢？
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int temp=r.nextInt(101);
            int count=0;//必须放在循环内，否则只要有一个重复数字就会永远不等于0
            for(int j = 0; j < i; j++){
                if(temp==arr[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr[i]=temp;

                i++;//i++;//如果写在外循环出现重复会变成0；
            }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }

    }


package test;

public class test1 {
    public static void main(String[] args) {
   /*     给你一个数组 nums 和一个值 val，你需要删除所有数值等于 val 的元素
        举例1：
        输入：nums = [3,2,2,3]    val = 3
        输出：nums = [2,2]  剩余2个元素
        举例1：
        输入：nums = [0,1,2,2,3,0,4,2]    val = 2
        输出：nums = [0,1,4,0,3]  剩余5个元素*/
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        int slow=0;
        int fast=0;
        while(fast<=nums.length-1){
            if(nums[fast]!= val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println("剩余"+slow+"个元素");
    }
}

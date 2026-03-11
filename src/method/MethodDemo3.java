package method;

public class MethodDemo3 {
    /* 定义一个方法遍历数组中的元素
     格式：[1 ,2 ,3 ,4 ,5]*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ,");
            }
        }
        System.out.println("]");
    }
}

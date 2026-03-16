package OopTest.OopToolclass;

public class ArrayUtils {
    private ArrayUtils(){}
    public static String printArray(int[] arr) {
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                result+=arr[i]+"]";
            }
            else{
                result+=arr[i]+",";
            }
        }
        return result;
    }
    public  static double getaverage(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg=sum*1.0/arr.length;
        return avg;
    }
}

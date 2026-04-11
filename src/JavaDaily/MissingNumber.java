//package JavaDaily;
//
//import java.util.Arrays;
//
//public class MissingNumber {
//    public static void main(String[] args) {
//
//    }
//
//    public int missingNumber(int[] nums) {
//
//        long n = nums.length+1;
//        long pres =0;
//        for (int i=0;i<nums.length;i++){
//            pres=pres+nums[i];
//        }
//        long expSum = n * (n + 1) / 2;
//        return (int) (expSum-pres);
//
//    }
//}

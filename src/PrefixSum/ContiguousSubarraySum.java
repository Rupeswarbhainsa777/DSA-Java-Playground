package PrefixSum;

public class ContiguousSubarraySum {
    public static void main(String[] args) {
        int arr[] = {23,2,4,6,7};
        System.out.println( checkSubarraySum(arr, 6));
    }

    public static boolean checkSubarraySum(int[] nums, int m) {
        int length = nums.length;

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j <= length - i; j++) {
                int sum = 0;
                for (int k = j; k < i + j; k++) {

                    sum = sum + nums[k];
                    System.out.print(sum);
//                    if(sum%m==0){
//                        return true;
//                    }
                    System.out.println();

                }

            }
        }
        return false;


    }
}

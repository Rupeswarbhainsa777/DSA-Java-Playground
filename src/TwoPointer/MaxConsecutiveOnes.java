package TwoPointer;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int arr[] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(longestOnes(arr, 2));
    }

    public static int longestOnes(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int zero = 0;
        int maxLength = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                zero++;

            }
            while (zero > k) {
                if (nums[i] == 0) {
                    zero--;
                }
                i++;
            }


                int len = j - i + 1;
                maxLength = Math.max(len, maxLength);



            j++;
        }
        return maxLength;
    }


    // Brute force

//    public static int longestOnes(int[] nums, int k) {
//
//
//        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int maxZeros = 0;
//            for (int j = i; j < nums.length; j++) {
//
//                if (nums[j] == 0) {
//                    maxZeros++;
//                }
//                if (maxZeros <= k) {
//                    int length  = j - i + 1;
//                    max = Math.max(length, max);
//                } else {
//                    break;
//                }
//            }
//        }
//        return max;
//
//
//    }
}

package JavaDaily;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistance {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 2, 1, 2};
        System.out.println(minimumDistance(arr));


    }

    public static int minimumDistance(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {

                        sum = sum + Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);


                    }
                }
            }
        }
        return sum;
    }
}

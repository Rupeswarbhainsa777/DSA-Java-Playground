package DsaSeries;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {

        int arr[] ={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {

        Arrays.sort(nums);


        for (int i=1;i<nums.length;i++){

            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return 0;

    }
}

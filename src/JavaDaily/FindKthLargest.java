package JavaDaily;

import java.util.Arrays;

public class FindKthLargest {
    public static void main(String[] args) {

        int arr[] = {3,2,1,5,6,4};
        System.out.println(findKthLargest(arr,2));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        revArray(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        return nums[k-1];
    }

    public static void revArray(int arr[]) {

        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;
        }
    }

}

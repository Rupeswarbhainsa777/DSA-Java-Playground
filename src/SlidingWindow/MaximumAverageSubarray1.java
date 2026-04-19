package SlidingWindow;

public class MaximumAverageSubarray1 {
    public static void main(String[] args) {

        int arr[] = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(arr, 4));
    }

    public static double findMaxAverage(int[] nums, int m) {

        double sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + nums[i];
        }

        double max = sum;

        for (int i=m;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-m];
            max = Math.max(sum,max);
        }
        return max/m;
    }
}

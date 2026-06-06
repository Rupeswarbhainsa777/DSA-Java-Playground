package DsaSeries.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {


        int len = height.length;
        int leftArr[] = new int[len];
        int rightArr[] = new int[len];


        leftArr[0] = height[0];
        rightArr[len - 1] = height[len - 1];

        for (int i = 1; i < height.length; i++) {
            leftArr[i] = Math.max(leftArr[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            rightArr[i] = Math.max(rightArr[i + 1], height[i]);
        }


//
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += Math.min(leftArr[i], rightArr[i]) - height[i];
        }
        return ans;


    }
}

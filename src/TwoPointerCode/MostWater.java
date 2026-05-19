package TwoPointerCode;

public class MostWater {
    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));

    }

    public static int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {


            int width = right - left;
            int length = Math.min(height[left], height[right]);

            int area = width * length;
            res = Math.max(res, area);

            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }

        }

        return res;
    }
}

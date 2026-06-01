package DsaSeries;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int res[] = productExceptSelf(arr);
    }

    public static int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    val *= nums[j];
                }
            }
            res[idx++] = val;
        }
        return res;
    }
}

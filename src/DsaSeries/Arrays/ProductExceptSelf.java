package DsaSeries.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int res[] = productExceptSelf3(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] productExceptSelf3(int[] nums) {

        int n = nums.length;
        int res[] = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix = suffix * nums[i + 1];
            res[i] *= suffix;
        }


        return res;


    }

    public static int[] productExceptSelf1(int[] nums) {

        int n = nums.length;

        int prefix[] = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];

        }
        int suffix[] = new int[n];
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];


        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = suffix[i] * prefix[i];
        }

        return nums;


    }

    public static int[] productExceptSelf2(int[] nums) {
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

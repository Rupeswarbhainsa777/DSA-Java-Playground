package DsaSeries.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0};

        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        int idx = 0;
        for (int i = 1; i <= zero; i++) {
            nums[idx++] = 0;
        }
        for (int i = 1; i <= one; i++) {
            nums[idx++] = 1;
        }
        for (int i = 1; i <= two; i++) {
            nums[idx++] = 2;
        }

    }
}

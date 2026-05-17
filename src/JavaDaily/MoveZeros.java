package JavaDaily;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        moveZeroes(arr);

    }

    public static void moveZeroes(int[] nums) {


        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        while (idx < nums.length ) {
            nums[idx++] = 0;
        }


        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}

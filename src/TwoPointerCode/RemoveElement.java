package TwoPointerCode;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int idx = 0;
        int count = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
                count++;
            }
            i++;
        }
        return count;
    }

}

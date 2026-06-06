package DsaSeries.Arrays;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == 0 && nums[0] != nums[mid + 1]) {
                return nums[mid];
            }
            if (mid == nums.length - 1 && nums[nums.length-1] != nums[nums.length - 2]) {
                return nums[mid];
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                return nums[mid];
            }
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }
        return -1;
    }

    //Linear search
    public static int singleNonDuplicate1(int[] nums) {

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}


package DsaSeries;

import java.util.HashMap;
import java.util.Map;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search1(arr, 0));

    }

    public static int search1(int[] nums, int target) {

        int right = nums.length - 1;
        int left = 0;

        while (left <= right) {
            int mid = (right + (right - left)) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }
        return -1;

    }

    public static int search(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // index
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i][0] == target) {
                return arr[i][1];
            }

        }
        return -1;
    }
}

// This approach was not working
//Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//        map.put(nums[i], i);
//        }
//                return map.get(target);

package Top_Coding_Question.SearchingSorting;

import java.util.Arrays;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 7};

        int res[] = occurrence(arr, 7);

        System.out.println(Arrays.toString(res));
    }

    public static int[] occurrence(int arr[], int target) {

        int first = -1;
        int last = -1;

        int left = 0;
        int right = arr.length - 1;

        // Find first occurrence
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;

        // Find last occurrence
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}
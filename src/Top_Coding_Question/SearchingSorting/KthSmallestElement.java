
package Top_Coding_Question.SearchingSorting;

import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {

        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;

        smallestElement(arr, k);
    }

    public static void smallestElement(int arr[], int k) {

        if (k < 1 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }

        Arrays.sort(arr);

        System.out.println("Kth Smallest Element: " + arr[k - 1]);
    }
}

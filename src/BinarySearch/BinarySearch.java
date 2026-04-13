package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int binarySearch(int arr[], int k) {

        int right = arr.length-1;
        int left = 0;

        while (left <= right) {
            int mid = left + (right-left)/2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }
        }
        return -1;
    }

}

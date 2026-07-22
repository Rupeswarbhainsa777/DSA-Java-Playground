package DsaSeries.Arrays;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int form = sc.nextInt();

        rotate(arr, form);
        reverse(arr);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void rotate(int arr[], int form) {

    }

    public static void reverse(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

}

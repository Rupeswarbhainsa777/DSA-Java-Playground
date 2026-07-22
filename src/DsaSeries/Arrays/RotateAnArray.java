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

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void rotate(int arr[], int form) {

        int n = arr.length;;
        form = form % arr.length;

        reverse(arr,0,n-1);
        reverse(arr,0,form-1);
        reverse(arr,form,n-1);


    }

    public static void reverse(int arr[], int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

}

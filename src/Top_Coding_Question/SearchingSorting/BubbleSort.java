package Top_Coding_Question.SearchingSorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 3};

        bubble(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
}
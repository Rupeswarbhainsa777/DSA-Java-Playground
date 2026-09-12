package LeetCodeDaily;

import java.util.ArrayList;

public class UniqueEvenDigit {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        int val = totalNumbers(arr);
    }

    public static int totalNumbers(int[] arr) {


        ArrayList<Integer> list = new ArrayList<>();

        int len = arr.length;

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= len - i; j++) {
                for (int k = j; k < i + j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
        return 1;

    }

}

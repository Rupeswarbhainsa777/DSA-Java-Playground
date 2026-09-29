package Top_Coding_Question.Arrays;

import java.util.Scanner;

public class AscendingOrderCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (checkIfArrays(arr) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

    public static boolean checkIfArrays(int arr[]) {


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }
}

package Top_Coding_Question.Arrays;

import java.util.Scanner;

public class AverageOfAlElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        averageOfAllElements(arr);

    }

    public static void averageOfAllElements(int arr[]) {
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        avg = sum/arr.length;
        System.out.println(avg);
    }
}

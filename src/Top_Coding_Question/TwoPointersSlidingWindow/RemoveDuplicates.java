package Top_Coding_Question.TwoPointersSlidingWindow;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();
        System.out.println("Add THe values of In Arrays");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void removeDuplicates(int arr[]) {

        Set<Integer> set = new TreeSet<>();


        for (int x : arr) {
            set.add(x);
        }
        for (int value : set) {
            System.out.print(value + " ");
        }

    }
}

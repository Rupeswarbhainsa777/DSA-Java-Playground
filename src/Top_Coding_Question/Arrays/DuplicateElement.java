package Top_Coding_Question.Arrays;

import java.util.Arrays;

public class DuplicateElement {

    public static void main(String[] args) {

        int arr[] = {1, 1, 4, 4, 6, 6, 2, 3, 1, 2};
        duplicateElement(arr);
    }

    public static void duplicateElement(int arr[]) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);

                // Skip remaining occurrences of the same number
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}
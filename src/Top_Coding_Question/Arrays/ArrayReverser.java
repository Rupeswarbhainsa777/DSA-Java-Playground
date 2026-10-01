package Top_Coding_Question.Arrays;


public class ArrayReverser {
    public static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap the elements using a temporary variable
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers inward
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        reverseInPlace(numbers);

        // Output will be: 50, 40, 30, 20, 10
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

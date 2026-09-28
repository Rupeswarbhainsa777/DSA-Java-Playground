package Top_Coding_Question.Arrays;

public class SecondLargest {

    public static void main(String[] args) {


        int arr[] = {1, 2, 5, 6, 78,};
        secondLargest(arr);
    }

    public static void secondLargest(int arr[]) {
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fmax) {
                smax = fmax;
                fmax = arr[i];

            } else if (arr[i] > smax && smax != arr[i]) {
                smax = arr[i];
            }


        }

        System.out.println("First Max " + fmax + " Second Max " + smax);

    }
}

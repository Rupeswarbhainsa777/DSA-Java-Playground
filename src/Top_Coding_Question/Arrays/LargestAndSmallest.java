package Top_Coding_Question.Arrays;

public class LargestAndSmallest {


    public static void main(String[] args) {


        int arr[] = {1, 3, 6, 8, 3, 4, 9, -1};

        int res[] = largestSmallest(arr);

        System.out.println("Largest element -> " + res[0]);
        System.out.println("Smallest element -> " + res[1]);

    }

    public static int[] largestSmallest(int arr[]) {

        int res[] = new int[2];

        res[0] = arr[0];
        res[1] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > res[0]) {
                res[0] = arr[i];
            }
            if (arr[i] < res[1]) {
                res[1] = arr[i];
            }


        }


        return res;

    }
}

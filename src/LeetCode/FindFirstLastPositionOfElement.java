package LeetCode;

public class FindFirstLastPositionOfElement {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};

        int res[] = searchRange(arr, 8);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] searchRange(int[] arr, int t) {

        int res[] = {-1, -1};

        if (arr.length == 0) return res;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == t) {
                res[0] = i;

                int j = i;
                while (j < arr.length && arr[j] == t) {
                    j++;
                }

                res[1] = j - 1;
                break; // important
            }
        }

        return res;
    }
}

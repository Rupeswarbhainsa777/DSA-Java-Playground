package Top_Coding_Question.SearchingSorting;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        int res = binarySearch(arr, 3);

        System.out.println(res);
    }

    public static int binarySearch(int arr[], int t) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] > t) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
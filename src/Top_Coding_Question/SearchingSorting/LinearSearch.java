package Top_Coding_Question.SearchingSorting;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 7, 3, 6, 8};
        int res =  linearSearch(arr,5);
        System.out.println(res);
    }

    public static int linearSearch(int arr[], int t) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == t) {
                res = i;
            }
        }
        return res;

    }
}

package JavaDaily;

import java.util.ArrayList;
import java.util.List;

public class FindFirstSecond {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 4, 5, 6};
        int x = 2;
        List<Integer> li = find(arr, x);
        System.out.println(li);
    }

    public static ArrayList<Integer> find(int arr[], int x) {

        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                li.add(i);
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                li.add(i);
                break;
            }
        }
        return li;

    }
}

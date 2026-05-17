package JavaDaily;

public class CountFreq {
    public static void main(String[] args) {
          int arr[] = {1, 1, 2, 2, 2, 2, 3};
          int t = 2;
        System.out.println(countFreq(arr,2));
    }

    public static int countFreq(int[] arr, int target) {
        // code here
        int i = 0;
        int j = arr.length - 1;

        while (i < arr.length - 1) {
            if (i == target) {
                break;
            }
            i++;
        }
        while (j < 0) {
            if (j == target) {
                break;
            }
            j--;
        }
        return j - i;
    }
}

package DsaSeries.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res ^= i;
        }
        return res;
    }
}

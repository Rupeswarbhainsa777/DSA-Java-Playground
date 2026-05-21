package DsaSeries;

public class BestTimeToBuyStock {
    public static void main(String[] args) {

        int arr[] = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {


        int res = 0;

        int first = arr[0];


        for (int i = 1; i < arr.length; i++) {

            if (first > arr[i]) {
                first = arr[i];
            } else {
              res =  Math.max(res, arr[i] - first);
            }

        }


        return res;
    }
}

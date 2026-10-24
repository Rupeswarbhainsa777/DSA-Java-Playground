package Top_Coding_Question.TwoPointersSlidingWindow;

public class FindMaximumSum {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int res = maximumSum(arr);
        System.out.println(res);
    }

    public static int maximumSum(int arr[]) {


        int max = 0;
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length - i; j++) {

                int findMax = 0;
                for (int k = j; k < i + j; k++) {
                   findMax+=arr[k];
                }
                if(findMax>max){
                    max=findMax;
                }
            }
        }
        return max;


    }
}

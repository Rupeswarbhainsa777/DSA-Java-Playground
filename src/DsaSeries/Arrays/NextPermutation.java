package DsaSeries.Arrays;

public class NextPermutation {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void nextPermutation(int[] nums) {

        int pivot = -1;


        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }

        }
        if(pivot==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }



        }
        reverse(nums,pivot+1,nums.length);


    }


    public static void reverse(int arr[], int st, int end) {

        while (st <= end) {
            int temp = arr[end];
            arr[end] = arr[st];
            arr[st] = temp;
            st++;
            end--;
        }

    }
}

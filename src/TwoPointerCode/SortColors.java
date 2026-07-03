package TwoPointerCode;

public class SortColors {
    public static void main(String[] args) {
       int arr[] = {2,0,2,1,1,0};

       sortColors(arr);
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
    public static void sortColors(int[] nums) {

        int left =0;
        int right =nums.length-1;

        while (left<right){
            if(nums[left]>=nums[right]){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            left++;
            right--;
        }

    }
}

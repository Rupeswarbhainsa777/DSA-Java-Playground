package TwoPointer;

public class SortArrayByParity {
    public static void main(String[] args) {

    }
    public static int[] sortArrayByParity(int[] nums) {


        int arr[] = new int[nums.length];
        int i =0;
        int j = nums.length-1;

        int k =0;
        while (k<nums.length){

            if(nums[k]%2==0){
                arr[i]=nums[k];
                i++;
            }
            else {
                arr[j]=nums[k];
                j--;
            }
            k++;
        }
        return arr;

    }
}
//nums[i] = nums[j]^nums[i];
//nums[j] = nums[j]^nums[i];
//nums[i] = nums[j]^nums[i];
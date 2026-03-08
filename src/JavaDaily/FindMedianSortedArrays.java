package JavaDaily;
import java.util.*;
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int arr1[] = {1,3,5,6};
        int arr2[] = {1,3,5,6};

        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int idx =0;

        int arr[] = new int[nums1.length+nums2.length];

        for(int x : nums1)
        {
            arr[idx++]=x;
        }
        for(int x : nums2)
        {
            arr[idx++]=x;
        }
        Arrays.sort(arr);
        int n = arr.length;
        double val = 0;

        if(n %2 ==0){

            val = arr[n/2-1]+arr[n/2]/2.0;

        }
        else {
            val = arr[n/2];
        }

        return val;

    }
}

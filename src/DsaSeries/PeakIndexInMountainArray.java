package DsaSeries;


public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {

        int left = 1;
        int right = arr.length - 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                left = mid+1;
            }else {
                right = mid-1;
            }

        }
        return -1;


    }
}

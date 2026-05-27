package DsaSeries;

import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2,3};

        System.out.println(  printAllSum(arr, 3));
    }


    public static int printAllSum(int[] arr, int t) {

        int pre[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < pre.length; i++) {

            sum = sum + arr[i];
            pre[i] = sum;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < pre.length; i++) {

            if (pre[i] == t) count++;
            int val = pre[i] - t;
            if (map.containsKey(val)) {
                count += map.get(val);
            }

               map.put(pre[i], map.getOrDefault(pre[i],0)+1);

        }

        return count;

    }


    public static void prefixSum(int arr[]) {

        int value = 0;

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {

            value = value + arr[i];
            arr[idx++] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }


    public static int subarraySum(int[] nums, int t) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                if (sum == t) {
                    count++;
                }

            }
        }

        return count;
    }
}

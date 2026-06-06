package DsaSeries.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {3,2,3, 2, 3, 2, 3, 2, 2,3};
        System.out.println(majorityElement3(arr));
    }

    public static int majorityElement3(int arr[]) {
        int res = 0, freq = 0;

        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                res = arr[i];
            }
            if (res == arr[i]) {
                freq++;
            } else {
                freq--;
            }

        }
        return res;

    }

    public static int majorityElement2(int arr[]) {
        Arrays.sort(arr);
        int res = arr[0];
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                freq = 1;
                res = arr[i];

            }
            if (freq > arr.length / 2) {
                return res;
            }
        }


        return res;
    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int mid = nums.length / 2;
        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            if (ent.getValue() > mid) {
                return ent.getKey();
            }
        }
        return 0;

    }

}

//package DsaSeries;
//
//import java.util.concurrent.DelayQueue;
//
//public class SlidingWindowMaximum {
//    public static void main(String[] args) {
//
//        testDq();
////        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
////        int res[] = maxSlidingWindow(arr, 3);
////        for (int i = 0; i < res.length; i++) {
////            System.out.print(res[i] + " ");
////        }
//    }
//
//    public static void testDq() {
//        DelayQueue<Integer> delayQueue = new DelayQueue<Integer>();
//
//        delayQueue.add(1);
//        System.out.println(delayQueue);
//    }
//
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//
//        int res[] = new int[nums.length - k + 1];
//        int idx = 0;
//        for (int i = 0; i <= nums.length - k; i++) {
//            int max = 0;
//            for (int j = i; j < i + k; j++) {
//                max = Math.max(nums[j], max);
//            }
//            res[idx] = max;
//            idx++;
//
//        }
//
//
//        return res;
//    }
//}

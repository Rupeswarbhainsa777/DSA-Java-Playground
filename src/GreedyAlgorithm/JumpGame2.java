package GreedyAlgorithm;

public class JumpGame2 {
    public static void main(String[] args) {

    }
//    2,3,1,1,4
    public static int jump(int[] nums) {

        int maxJump =0;
        int cover = 0;
        int lastIdx =0;
        if(nums.length==0) return 0;

        for (int i=0;i<nums.length;i++){

            cover = Math.max(cover,i+nums[i]);

            if(i==lastIdx) {
                lastIdx = cover;
                maxJump++;


                if (cover >= nums.length - 1) {
                    return maxJump;
                }
            }
        }

        return maxJump;



    }
}

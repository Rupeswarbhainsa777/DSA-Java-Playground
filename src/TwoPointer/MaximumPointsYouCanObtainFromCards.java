package TwoPointer;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {

    }

    public static int maxScore(int[] cardPoints, int k) {


        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < k; i++) {
            lsum = lsum + cardPoints[i];
        }
        int maxsum = lsum;
        int last = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[last];
            last--;
            maxsum = Math.max(maxsum, lsum + rsum);
        }
        return maxsum;

    }

}

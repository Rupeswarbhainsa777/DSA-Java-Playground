package DsaSeries.Arrays;

public class PowOfN {
    public static void main(String[] args) {
        double value = 2.00000;

        double res = myPow(value, 10);
        System.out.println(res);
    }

    public static double myPow(double x, int n) {
        int m = n;
        double ans = 1;

        while (n > 0) {

            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            } else {
                n = n / 2;
                x = x * x;
            }

        }
        if (m < 0) {
            ans = 1 / ans;
        }
        return ans;

    }
}

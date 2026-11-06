package Top_Coding_Question.NumbersMathematics;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(7));  // true
        System.out.println(isPrime(10)); // false
        System.out.println(isPrime(1));  // false
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
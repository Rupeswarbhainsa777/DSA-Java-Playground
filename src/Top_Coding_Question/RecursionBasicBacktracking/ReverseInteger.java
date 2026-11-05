package Top_Coding_Question.RecursionBasicBacktracking;

public class ReverseInteger {

    public static void main(String[] args) {
        int num = 12345;

        System.out.println(reverse(num, 0));
    }

    public static int reverse(int num, int rev) {

        if (num == 0) {
            return rev;
        }

        rev = rev * 10 + num % 10;

        return reverse(num / 10, rev);
    }
}
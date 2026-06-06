package DsaSeries.Strings;

public class Palindrome {
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && s.charAt(left) == ' ') {
                left++;
            }
            while (left < right && s.charAt(right) == ' ') {
                right--;
            }

            if ((s.charAt(left)) != s.charAt(right)) {


                return false;
            }

            left++;
            right--;
        }
        return true;

    }
}

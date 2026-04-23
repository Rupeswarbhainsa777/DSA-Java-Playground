package TwoPointer;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        boolean value = validPalindrome("abc");
        System.out.println(value);
    }

    public static boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        int count = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {

                i++;
                j--;


            } else if (s.charAt(i) != s.charAt(j)) {
                count++;
                i++;
                j--;
            } else if (s.charAt(i) != s.charAt(j) && count > 1) {
                return false;
            }

        }
        return true;
    }
}

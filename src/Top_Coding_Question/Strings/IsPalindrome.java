package Top_Coding_Question.Strings;

public class IsPalindrome {

    public static void main(String[] args) {

        String str = "MOM";

        if (str.equals(reverse(str))) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    public static String reverse(String str) {
        String t = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            t = t + str.charAt(i);
        }
        return t;


    }
}

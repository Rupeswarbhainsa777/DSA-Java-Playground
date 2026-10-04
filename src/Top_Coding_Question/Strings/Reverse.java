package Top_Coding_Question.Strings;

public class Reverse {

    public static void main(String[] args) {

        String str = "ROM";

        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String t = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            t = t + str.charAt(i);
        }
        return t;


    }
}

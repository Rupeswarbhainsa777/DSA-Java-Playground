package TwoPointerCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "luffy is still joyboy";
        System.out.print(lengthOfLastWord1(str));
    }

    public static int lengthOfLastWord1(String s) {
        int i = s.length() - 1;

        int count = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;

            i--;

        }


        return count;

    }

    public static int lengthOfLastWord(String s) {

        String str = s.trim();


        int i = str.length() - 1;

        int count = 0;
        while (i >= 0 && str.charAt(i) != ' ') {
            count++;

            i--;

        }


        return count;
    }
}

package Top_Coding_Question.Strings;

public class ReverseTheWordsSentence {
    public static void main(String[] args) {

        String str = "I am not ig";

        String res = wordSentence(str);
        System.out.println(res);

    }

    public static String wordSentence(String str) {

        String ar[] = str.split(" ");

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ar.length; i++) {

            if (i != 0) {
                sb.append(" ");
                sb.append(reverse(ar[i]));
            }else {
                sb.append(reverse(ar[i]));

            }
        }

        return sb.toString();

    }

    public static String reverse(String str) {
        String t = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            t = t + str.charAt(i);
        }
        return t;
    }
}

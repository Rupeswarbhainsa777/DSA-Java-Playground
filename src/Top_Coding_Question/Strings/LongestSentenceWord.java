package Top_Coding_Question.Strings;

public class LongestSentenceWord {

    public static void main(String[] args) {

        String str = "I Test Your Skills for To day";

        String res = longest(str);

        System.out.println(res);


    }

    public static String longest(String str) {


        String arr[] = str.split(" ");

        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > res.length()) {
                res = arr[i];
            }
        }
        return res;
    }
}

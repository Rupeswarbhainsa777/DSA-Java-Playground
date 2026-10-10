package Top_Coding_Question.Strings;

public class CheckWhetherStringRotation {
    public static void main(String[] args) {


        System.out.println(checkWhetherStringRotation("abcde","cdeab"));







    }

    public static boolean checkWhetherStringRotation(String first, String second) {


        if(first.length()!=second.length()) return false;



        return (first+first).contains(second);
    }
}

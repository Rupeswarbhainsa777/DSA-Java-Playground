package LeetCodeDaily;

public class NumbersOfSubString {
    public static void main(String[] args) {

    }

    public static int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String str : patterns) {
            if (word.contains(str)) {
                count++;
            }
        }

        return count;


    }
}

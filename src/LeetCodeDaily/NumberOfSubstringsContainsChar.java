package LeetCodeDaily;

public class NumberOfSubstringsContainsChar {
    public static void main(String[] args) {

        System.out.println(numberOfSubstrings("abcabc"));


    }

    public static int numberOfSubstrings(String str) {

        int length = str.length();
        int count = 0;
        String chars = "abc";
        for (int i = 0; i < length; i++) {

            for (int j = i; j < length; j++) {

                String t = "";

                for (int k = i; k <= j; k++) {
                    t += str.charAt(k);
                }
                if(t.contains(chars)){
                    count++;
                }


            }
        }
        return count;

    }
    public static void subString(String str) {

        int length = str.length();

        for (int i = 0; i < length; i++) {

            for (int j = i; j < length; j++) {

                String t = "";

                for (int k = i; k <= j; k++) {
                    t += str.charAt(k);
                }

                System.out.println(t);
            }
        }
    }
}

package DsaSeries.Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

        String st1 = "sos";
        String st2 = "sos";

        System.out.println(isAnagram(st1, st2));
    }

    public static boolean isAnagram(String s, String t) {

        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);


    }
}

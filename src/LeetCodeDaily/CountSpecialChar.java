package LeetCodeDaily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountSpecialChar {
    public static void main(String[] args) {
        String word = "AbBCab";
        System.out.println(numberOfSpecialChars(word));

    }

    public static int numberOfSpecialChars(String word) {
        int count = 0;

        if(Character.isUpperCase(word.charAt(0))){
            return 0;
        }
        Set<Character> set = new HashSet<>();


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(Character.isUpperCase(ch)){
                if(set.contains(Character.toLowerCase(ch))){
                    count++;
                }
            }
            if(Character.isLowerCase(ch)){
                if(set.contains(Character.toUpperCase(ch))){
                    count++;
                }
            }
            set.add(ch);
        }
        return count;


//        int count = 0;
//        char arr[] = word.toCharArray();
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            count++;
//            if (arr[i] >= 'a' && arr[i] < +'z') {
//                break;
//            }
//        }
//        return count;
    }
}

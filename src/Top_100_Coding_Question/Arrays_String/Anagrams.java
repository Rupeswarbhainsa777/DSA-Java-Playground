package Top_100_Coding_Question.Arrays_String;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        System.out.println(anagrams(str1,str2));
    }
    public static boolean  anagrams(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);


    }
}

package Leetcode_150;


import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {

         wordPattern("abba","dog cat cat cat");
    }

 public static boolean wordPattern(String pattern, String s) {

     Map<Character,String> map = new HashMap<>();

     String str[] =  s.split(" ");

     if(pattern.length()!= str.length){
         return false;
     }
     for(int i=0;i<pattern.length();i++) {

         char ch = pattern.charAt(i);

         if (map.containsKey(ch)) {
             // If key exists but value doesn't match → false
             if (!map.get(ch).equals(str[i])) {
                 return false;
             }
         } else {
             // If value already mapped to another key → false
             if (map.containsValue(str[i])) {
                 return false;
             }
             map.put(ch, str[i]);
         }
     }
     return true;
 }
}

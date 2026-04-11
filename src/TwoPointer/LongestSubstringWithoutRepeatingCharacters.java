package TwoPointer;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        int length = s.length();
        int i=0;
        int j=0;

        int max =0;
        while (j<length){

            char ch = s.charAt(j);

            if(map.containsKey(ch)){
                i=Math.max(i,map.get(ch)+1);

            }
            map.put(ch,j);
            max = Math.max(max,j-i+1);
            j++;

        }
        return max;
    }
}

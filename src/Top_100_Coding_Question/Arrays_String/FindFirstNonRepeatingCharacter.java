package Top_100_Coding_Question.Arrays_String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "AABBCCR";
        System.out.println( findFirstNonRepeatingCharacter(str));

    }
    public static char findFirstNonRepeatingCharacter(String str)
    {
        char c ='\u0000';

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> ent : map.entrySet()){
            if(ent.getValue()==1){
                c=ent.getKey();
                break;
            }
        }
        return c;

    }

}

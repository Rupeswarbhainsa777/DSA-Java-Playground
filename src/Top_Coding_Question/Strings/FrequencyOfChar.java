package Top_Coding_Question.Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "CHCHCARAKKMG";
        frequencyOfCharacters(str);
    }

    public static void frequencyOfCharacters(String str) {

        Map<Character, Integer> map = new HashMap<>();

        char arr[] = str.toCharArray();

        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character,Integer> ent: map.entrySet() ){
            System.out.println(ent.getKey() + " "+ ent.getValue());
        }

    }
}

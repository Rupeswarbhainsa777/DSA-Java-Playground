package Top_100_Coding_Question.Arrays_String;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class OccurrencesOfEach {
    public static void main(String[] args) {
    String str = "javasieubf";
    printFreqOfString(str);
    }
    public static void printFreqOfString(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> ent : map.entrySet()){
            if((ent.getKey() >= 'A' && ent.getKey()<='Z')  || (ent.getKey() >= 'a' && ent.getKey()<='z')){
                System.out.println(ent.getKey()+" "+ent.getValue());
            }
        }
    }
}

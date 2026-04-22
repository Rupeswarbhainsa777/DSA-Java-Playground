package TwoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCommonWords {
    public static void main(String[] args) {
        String words1[] = {"leetcode", "is", "amazing", "as", "is"};
        String words2[] = {"amazing", "leetcode", "is"};

        System.out.println(countWords(words1, words2));


    }

    public static int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : words1) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int count = 0;
        int idx = 0;
        for (Map.Entry<String, Integer> ent : map.entrySet()) {

            if ((ent.getKey() == words2[idx]) && ent.getValue() == 1) {
                count++;
                idx++;
            }
        }
        return count;

    }
}

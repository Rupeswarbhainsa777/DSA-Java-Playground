package Top_Coding_Question.HashingFrequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyInteger {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 4, 5, 2, 2,};
        frequency(arr);
    }

    public static void frequency(int arr[]) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
        }


    }
}

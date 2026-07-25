package DsaSeries.Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "i love java and also javascript love";
        removeDuplicate(str);
    }

    public static void removeDuplicate(String str) {

        Set<String> set = new HashSet<>();

        String arr[] = str.split(" ");

        for (String val : arr) {
            set.add(val);
        }
        for (String v : set){
            System.out.println(v);
        }

    }

}

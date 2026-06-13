package DsaSeries.Strings;

import java.util.HashMap;
import java.util.Map;

public class StringCompress {
    public static void main(String[] args) {
        // {"a","a","b","b","c","c","c"}
        char arr[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(arr));

//        String str = "12";
//
//        char c = str.charAt(1);
//        System.out.println(c);
//        String st = String.valueOf(12);
//        System.out.println(st.charAt(0));


    }

    public static int compress(char[] chars) {

        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            if (count == 1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                String value = String.valueOf(count);
                for (int j = 0; j < value.length(); j++) {
                    chars[idx++] = value.charAt(j);
                }
            }
            i--;
        }
        return idx;

    }
}
























//package DsaSeries.Strings;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class StringCompress {
//    public static void main(String[] args) {
//        // {"a","a","b","b","c","c","c"}
//        char arr[] = {'a','a','b','b','c','c','c'};
//        System.out.println(compress(arr));
//    }
//
//    public static int compress(char[] chars) {
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char ch : chars) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        int count = 0;
//        StringBuffer sb = new StringBuffer();
//        for (Map.Entry<Character, Integer> ent : map.entrySet()) {
//
//            if (ent.getValue() > 1) {
//                sb.append(ent.getKey());
//                sb.append(ent.getValue());
//                count = count + 2;
//            } else {
//                sb.append(ent.getKey());
//                count++;
//
//            }
//
//        }
//        return count;
//
//    }
//}

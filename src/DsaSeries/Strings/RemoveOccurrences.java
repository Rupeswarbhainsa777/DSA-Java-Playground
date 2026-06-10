package DsaSeries.Strings;

public class RemoveOccurrences {
    public static void main(String[] args) {

        String string = "daabcbaabcbc";
        System.out.println(removeOccurrences(string,"abc"));

    }

    public static String removeOccurrences(String s, String part) {

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = part.length();

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
            if (sb.length() >= m) {
                String sub = sb.substring(sb.length() - m);
                if (sub.equals(part)) {
                    sb.setLength(sb.length() - m);
                }
            }
        }
        return sb.toString();


    }
}

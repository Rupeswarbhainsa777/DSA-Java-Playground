package DsaSeries.Strings;

public class ReverseWords {
    public static void main(String[] args) {

        String st = "the sky is blue";
        System.out.println(reverseWords(st));
    }

    public static String reverseWords(String s) {

        String arr[] = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}

package TwoPointer;

public class ReverseString2 {
    public static void main(String[] args) {
        String st = "abcdefg";
        System.out.println(reverseStr(st, 2));
    }

    public static String reverseStr(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        String str = sb.substring(0,k);

        sb.replace(0,k,reverse(str));
        return sb.toString();

    }
    public static String reverse(String str){
        String t = "";
        for (int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            t=t+ch;
        }
        return t;
    }
}

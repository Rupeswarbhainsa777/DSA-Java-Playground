package TwoPointerCode;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";

        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String s) {
        String str[] = s.split(" ");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            char arr[] = str[i].toCharArray();
            reverse(arr, 0, arr.length - 1);

            sb.append(new String(arr));

        }

        return sb.toString();


    }

    public static void reverse(char ar[], int left, int right) {

        while (left < right) {
            char temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;

            left++;
            right--;
        }


    }
}

package Top_Coding_Question.Strings;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "FFMXXNCT";

        frequentChar(str);
    }

    public static void frequentChar(String str) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'A']++;
        }

        // Find the character with maximum frequency
        int max = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                mostFrequent = (char) (i + 'A');
            }
        }

        System.out.println("Most Frequent Character: " + mostFrequent);
        System.out.println("Frequency: " + max);
    }
}
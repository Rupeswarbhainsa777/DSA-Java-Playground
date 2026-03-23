package Top_100_Coding_Question.Arrays_String;

import java.util.Scanner;



public class ReverseEachWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverseWords(str));

    }
    public static String reverseWords(String str){
       StringBuffer sb = new StringBuffer();
        String st[] = str.split(" ");


        for (int i=0;i<st.length;i++){

           if(i!=0){
               sb.append(" ");
               sb.append(reverseStr(st[i]));
           }
           else {
               sb.append(reverseStr(st[i]));
           }
        }
        return sb.toString();



    }
    public static String reverseStr(String str){
        String t ="";
        for (int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            t=t+ch;
        }
        return t;
    }

}

package Top_100_Coding_Question.Arrays_String;

import java.util.Scanner;

public class NumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        numberOfVowelsAndConsonants(str);
    }
    public static void numberOfVowelsAndConsonants(String str){
        int vowels=0;
        int consonants =0;


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='A' || ch== 'E' || ch =='I' || ch=='O' || ch=='U' || ch=='a' || ch== 'e' || ch =='i' || ch=='o' || ch=='u' ){
                vowels++;
            }
            else if(!(ch=='A' || ch== 'E' || ch =='I' || ch=='O' || ch=='U' || ch=='a' || ch== 'e' || ch =='i' || ch=='o' || ch=='u')
                    && (ch>='a' || ch<= 'z')
                    && (ch>='A' || ch>= 'Z')){
                consonants++;
            }
        }
        System.out.println("Vowels ->" +vowels);
        System.out.println("Consonants ->" +consonants);
    }
}

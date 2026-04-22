package TwoPointer;

public class Contains {
    public static void main(String[] args) {

        String str1 = "Rojalinbhainsa";
        String str2 = "Rojalin";
        System.out.println(contains(str1,str2));

    }

    public static boolean contains(String str1, String str2) {

        int i=0;
        int j=0;
        while (i<str1.length() && j<str2.length()){
          if(str1.charAt(i)==str2.charAt(j)){
              j++;
          }
          i++;
        }

        return j==str2.length();

    }
}

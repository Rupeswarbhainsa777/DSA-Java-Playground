package Leetcode_150;

public class IsHappyNumber {
    public static void main(String[] args) {


    }
    public static boolean isHappy(int n) {

        int finalvalue = 0;
        while (n!=0){
            int lastdig = n%10;

            finalvalue +=lastdig*lastdig;
            n = n/10;
        }
        if(finalvalue==1){
            return true;
        }
        if (finalvalue == 4) {   // unhappy cycle
            return false;
        }


        return isHappy(finalvalue);


    }
}

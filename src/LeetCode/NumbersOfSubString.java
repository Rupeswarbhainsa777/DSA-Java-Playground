package LeetCode;

public class NumbersOfSubString {
    public static void main(String[] args) {
        System.out.println(numSub("0110111"));
    }
    public static int numSub(String s) {

        char arr[] = s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                count++;
            }
        }
        return count * (count+1)/2;


    }
}

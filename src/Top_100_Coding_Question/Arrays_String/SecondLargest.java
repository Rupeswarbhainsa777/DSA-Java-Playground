package Top_100_Coding_Question.Arrays_String;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int arr[]){
        int firstMaxNum =Integer.MIN_VALUE;
        int secondMaxNum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(firstMaxNum<arr[i]){
                secondMaxNum=firstMaxNum;
                firstMaxNum=arr[i];
            }
            else if(secondMaxNum<arr[i] && arr[i]!=firstMaxNum){
                secondMaxNum=arr[i];
            }
        }
        return secondMaxNum;
    }
}

package Top_100_Coding_Question.Arrays_String;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int newArr[] =  reverse(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();

    }

    public static int [] reverse(int arr[]){

        int left = 0;
        int right = arr.length-1;

        while (left<right){
           arr[left] =arr[left]^arr[right];
           arr[right] =arr[left]^arr[right];
           arr[left] =arr[left]^arr[right];
            left++;
            right--;
        }
        return arr;

    }

}

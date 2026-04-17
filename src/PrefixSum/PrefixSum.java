package PrefixSum;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2,3,5,2,-5,1,4};
        int resArr[] = prefixSum(arr);
        for (int i=0;i<resArr.length;i++){
            System.out.print(resArr[i]+" ");
        }

    }
    public static int[] prefixSum(int arr[]){
        int newArr[] = new int[arr.length];

        int idx =0;
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];

            newArr[idx] = sum;
            idx++;
        }
        return newArr;
    }
}

package Top_Coding_Question.SearchingSorting;

public class MergeTwoSorted {
    public static void main(String[] args) {


        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};

        int res[] = mere(arr1,arr2);

        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }

    public static int[] mere(int arr1[], int arr2[]) {

        int res[] = new int[arr2.length + arr1.length];

        int idx = 0;

        for (int i = 0; i < arr1.length; i++) {
            res[idx] = arr1[i];
            idx++;
        }
        for (int i = 0; i < arr2.length; i++) {
            res[idx] = arr2[i];
            idx++;
        }

        return res;

    }
}

package Top_Coding_Question.SearchingSorting;

public class SelectionShort {
    public static void main(String[] args) {


        int res[] = {4, 2, 3, 5, 6};
        selection(res);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void selection(int arr[]) {


        for (int i = 0; i < arr.length - 1; i++) {
            int k = arr[i];
            int idx = i;
            for (int j = idx + 1; j < arr.length; j++) {
                if (k > arr[j]) {
                    k = arr[j];
                    idx = j;
                }

            }

            int tem = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tem;


        }

    }


}

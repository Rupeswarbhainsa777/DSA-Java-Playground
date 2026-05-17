package JavaDaily;

public class SeparateTheDigit {
    public static void main(String[] args) {
        int arr[] = {13, 25, 83, 77};
        String str = "13";
       for (int i=0;i<str.length();i++){
           System.out.println(str.charAt(i)-'0');
       }

//        String nums = "";
//        for (int i = 0; i < arr.length; i++) {
//            nums += String.valueOf(arr[i]);
//
//        }
//        System.out.println(nums);

    }

    public static int[] separateDigits(int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {

            length += countDig(arr[i]);
        }
        int res[] = new int[length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            String numStr = String.valueOf(arr[i]);

            for (int j = 0; j < numStr.length(); j++) {
                res[index++] = numStr.charAt(j) - '0';
            }
        }

        return res;
    }

    private static int countDig(int num) {
        if (num == 0) return 1;
        int count = 0;

        while (num != 0) {
            int div = num % 10;
            count++;
            num = num / 10;
        }
        return count;

    }
}

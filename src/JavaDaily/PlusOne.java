package JavaDaily;

public class PlusOne {
    public static void main(String[] args) {
        int x = 10/2;
        System.out.println(x);
        System.out.println(10%2);
    }
    public  static  int[] plusOne(int[] digits) {


        for (int i=digits.length;i>=0;i--){
            if(digits[i]<9){

                digits[i]=digits[i]+1;
                return digits;
            }

            digits[i]=0;
        }
        int res[] = new int[digits.length+1];

        res[0]=1;
        return res;


    }



}

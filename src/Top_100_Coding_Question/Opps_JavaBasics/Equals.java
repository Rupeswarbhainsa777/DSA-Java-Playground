package Top_100_Coding_Question.Opps_JavaBasics;

public class Equals {
    public static void main(String[] args) {
        testEquals();
    }

    public static void testEquals() {

        // String literal → stored in String Constant Pool
        String str1 = "str";

        // new keyword → creates a new object in heap memory
        String str2 = new String("str");

        // '==' checks reference (memory address)
        // Here str1 and str2 point to different objects → false
        if (str1 == str2) {
            System.out.println("REF");

            // .equals() checks value/content of the object
            // Both contain same text "str" → true
        } else if (str1.equals(str2)) {
            System.out.println("Value");
        }
    }
}
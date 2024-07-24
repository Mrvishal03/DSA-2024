package Strings;

public class Compare {
    public static void main(String[] args) {
        String Str1 = "Vishal";
        String Str2 = "Thakur";

//1 str1 > str2 +ve value
//2 str1 == str2 0
//3 str1 < str2 -ve value

        // if (Str1.compareTo(Str2)==0) {
        //     System.out.println("Both Strings are equal");
            
        // }
        // else{
        //     System.out.println("Both Strings are not equal");
        // }
        if (Str1==Str2) {
            System.out.println("Both Strings are equal");
            
        }
        else{
            System.out.println("Both Strings are not equal");
        }

        // if (new String("Tony")==new String("Tony")) {
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }
    }
}

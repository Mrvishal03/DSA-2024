package Recurrsion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
   if (n==1) {
    return 1;
   }
   else{
    return n*fact(n-1);
   }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int result = fact(number);
        System.out.println(result);


    }
 
}

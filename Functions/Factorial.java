package Functions;

import java.util.Scanner;

public class Factorial {
    public static void printFact(int n){
        if (n<0) {
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
         System.out.println(fact);
         return;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        printFact(num);

    }

}

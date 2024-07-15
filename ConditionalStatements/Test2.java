package ConditionalStatements;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x= sc.nextInt();
        if (x%2==0) {
            System.out.println("Even");
            
        }else{
            System.out.println("Odd");
        }
    }
}

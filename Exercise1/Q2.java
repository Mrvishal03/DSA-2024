package Exercise1;

import java.util.Scanner;
//Write a function to print the sum of all odd numbers from 1 to n.
public class Q2 {
    public static int oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            
        if (i%2!=0) {
             sum = sum+i;
             
        }

        } return sum;
        
        
         

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range:");
    int n = sc.nextInt();
    int sum = oddSum(n);
    System.out.println("Sum of odd numbers in the given range is: "+sum);
    }
}

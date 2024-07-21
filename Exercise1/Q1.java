package Exercise1;


//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Q1 {
    public static void PrintAvg(int a,int b,int c){
        int avg = (a+b+c)/3;
        System.out.println("The average of three numbers is "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        PrintAvg(a,b,c);
    }
}

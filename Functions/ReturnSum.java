package Functions;

import java.util.Scanner;

public class ReturnSum {
    public static int add(int x,int y){
        int  sum=x+y;
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = add(a, b);
       System.out.println("sum of two number is"+sum);

    }
}

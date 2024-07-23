package Arrays;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int num [ ]= new int[size];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < size; i++) {
            num[i]= sc.nextInt();
        }
        for(int i = 0;i<num.length;i++)
        {
            System.out.print(" "+num[i]);
        }
         
    }
}

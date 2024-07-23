package Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of an array");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the to seach in an array");
        int x= sc.nextInt();
        for(int i= 0;i<arr.length;i++){
           
            System.out.print(arr[i]);
            if (arr[i]==x) {
                System.out.println("Element found at index " +i);
           
                 }
         }
         
         
    }
}

package Sorting;

import java.util.Scanner;

/*
  *   if we have n number of elements it will take n-1
        
         9 8 8 8
         8 9 7 7    phase1
         7 7 9 6
         6 6 6 9
         
         
         8 7 7
         7 8 6     phase2
         6 6 8
         9 9 9
         
         7 6
         6 7       phase3
         8 8
         9 9
         

         time complexity of bubble sort is O(n^2)

*/
  public class BubbleSort {
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         }
         System.out.println("The sorted array is");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
         }


     }
  }
    
      
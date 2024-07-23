package TwoDArrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter rows");
        int row = sc.nextInt();
        System.out.println("Enter columns");
        int col = sc.nextInt();
        int arr[][]= new int [row][col];
        System.out.println("Enter elements");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element to search");
        int x= sc.nextInt();
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(arr[i][j]==x){
                    System.out.println("Element found at "+i+" , "+j);
                }

        }

    }
}
}
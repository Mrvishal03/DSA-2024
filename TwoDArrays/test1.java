package TwoDArrays;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and columns of an array");
        int row = sc.nextInt();
        int cols= sc.nextInt();
        int[][] arr = new int[row][cols];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();

        }
    }

    for(int i =0;i<row;i++){
        for(int j=0;j<cols;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }


    }

}

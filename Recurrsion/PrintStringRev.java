package Recurrsion;

import java.util.Scanner;

public class PrintStringRev {
    public static void printString(String str ,int idx){
      if (idx==0) {
        System.out.println(str.charAt(idx));
        return;
        
      }
      System.out.println(str.charAt(idx));
      printString(str,idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String Str = sc.next();
        printString(Str,Str.length()-1);
    }
}

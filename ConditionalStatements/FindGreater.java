package ConditionalStatements;

import java.util.Scanner;

public class FindGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b) {
            System.out.println(a+ "is bigger");
            
        } else if(b>c) {
            System.out.println(b+ "is bigger");
            
        }
        else{
            System.out.println(c+ "is bigger");
        }
    }
}

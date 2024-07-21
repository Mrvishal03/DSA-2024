package Functions;

import java.util.Scanner;

public class PrintName {
    public static void printMyName(String x) {
        System.out.println("My name is Vishal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.next();
        printMyName(name);

    }
}

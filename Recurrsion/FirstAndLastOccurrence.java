package Recurrsion;

import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurrence(String str, int idx, char element) {
        // Base case: if index is out of bounds, return
        if (idx == str.length()) {
            return;
        }

        char current = str.charAt(idx);
        if (current == element) {
            if (first == -1) {
                first = idx;
            }
            last = idx;
        }

        // Recursive call
        findOccurrence(str, idx + 1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.next();
        System.out.println("Enter character to find:");
        char element = sc.next().charAt(0);
        findOccurrence(str, 0, element);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
package Exercise1;
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class Q5 {
    public static void checkVote(int age){
        if (age>=18) {
            System.out.println("You are eligile for vote");
            
        }
        else {
            System.out.println("You are not eligile for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person:");
        int age = sc.nextInt();
        checkVote(age);

    }
}

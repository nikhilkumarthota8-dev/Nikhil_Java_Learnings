package test_folder_practise.practise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial Program");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number for what you want factorial");
        int number = scan.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

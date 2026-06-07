package test_folder_practise.NewPractise;

import java.util.Scanner;

public class checkEvenorOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number you want to check:");
        int number = scan.nextInt();
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Number is even number: " + number);
            } else {
                System.out.println("Number is odd number: " + number);
            }
        }
    }
}

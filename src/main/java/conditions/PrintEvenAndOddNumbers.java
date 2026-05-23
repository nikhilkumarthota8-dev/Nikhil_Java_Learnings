package conditions;

import java.util.Scanner;

public class PrintEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Number:");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Is a Even Number");
            } else {
                System.out.println(i + " Is a Odd Number");
            }
        }
    }
}


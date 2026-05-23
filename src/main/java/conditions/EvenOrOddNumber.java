package conditions;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Its a Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

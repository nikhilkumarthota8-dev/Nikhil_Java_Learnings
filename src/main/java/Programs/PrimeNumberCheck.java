package Programs;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number:");
        int number = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " Is a prime number");
        } else {
            System.out.println("Not a prime number");
        }


    }
}

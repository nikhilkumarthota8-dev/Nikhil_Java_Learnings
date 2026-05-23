package loops;

import java.util.Scanner;

//- Print all prime numbers between 1 and 100 using a while loop.
public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Print All Prime Numbers from 1 - 100");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not A Prime Number");
        }

    }
}

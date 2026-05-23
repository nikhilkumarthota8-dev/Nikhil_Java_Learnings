package loops;

import java.util.Scanner;

//- Print all prime numbers between 1 and 100 using a while loop.
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Print All Prime Numbers from 1 - 100");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}

package test_folder_practise.practise;

import java.util.Scanner;

public class PrintPrimeNumbersTillRange {
    public static void main(StringLength[] args) {
        System.out.println("Welcome to Program:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Range:");
        int number = scan.nextInt();

        for (int num = 2; num <= number; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);
            }
        }
    }
}

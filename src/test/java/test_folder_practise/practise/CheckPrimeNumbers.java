package test_folder_practise.practise;

import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(StringLength[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number you want to check:");
        int number = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Its a prime Number");
        } else {
            System.out.println("Not a prime Number");
        }

    }
}

package test_folder_practise.otwani;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number to check:");
        int number = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " Number is a Prime Number:");
        } else {
            System.out.println("Not a Prime Number");
        }

    }
}

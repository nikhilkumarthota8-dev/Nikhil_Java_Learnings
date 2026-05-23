package test_folder_practise.practise;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(StringLength[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to check");
        int number = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number / i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Its a Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }

}

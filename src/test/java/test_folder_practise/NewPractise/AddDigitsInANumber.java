package test_folder_practise.NewPractise;

import java.util.Scanner;

public class AddDigitsInANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        int r, rev = 0, sum = 0;
        while (number > 0) {
            r = number % 10;
            sum = sum + r;
            number = number / 10;
        }
        System.out.println(sum);
    }
}

package test_folder_practise.NewPractise;

import java.util.Scanner;

public class CountNoOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int number = scan.nextInt();
        int r, rev = 0, count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}

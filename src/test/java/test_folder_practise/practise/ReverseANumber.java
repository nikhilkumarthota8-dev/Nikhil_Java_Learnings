package test_folder_practise.practise;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(StringLength[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number you want to reverse:");
        int number = scan.nextInt();
        int originalNumber = number;
        int reverseNumber = 0, r;
        while (number > 0) {
            r = number % 10;
            reverseNumber = (reverseNumber * 10) + r;
            number = number / 10;
        }
        System.out.println(reverseNumber);
        if (reverseNumber == originalNumber) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

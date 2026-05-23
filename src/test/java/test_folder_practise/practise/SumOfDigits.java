package test_folder_practise.practise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = scan.nextInt();
        int r, sum = 0;
        while (number > 0) {
            r = number % 10;
            sum = sum + r;
            number = number / 10;
        }
        System.out.println(sum);
    }
}

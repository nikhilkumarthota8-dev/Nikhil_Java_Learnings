package test_folder_practise.basic_folder;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int number = scan.nextInt();
        int r;
        int count = 0;
        int sum = 0;
        while (number > 0) {
            r = number % 10;
            sum = sum + r;
            number = number / 10;
        }

        System.out.println(sum);
    }
}

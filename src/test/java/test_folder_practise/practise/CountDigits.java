package test_folder_practise.practise;

import java.util.Scanner;

public class CountDigits {
    public static void main(StringLength[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = scan.nextInt();
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}

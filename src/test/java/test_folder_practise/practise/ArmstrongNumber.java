package test_folder_practise.practise;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = scan.nextInt();
        int originalNumber = number;
        int sum = 0;
        int r;
        while (number > 0) {
            r = number % 10;
            sum = sum + (r * r * r);
            number = number / 10;
        }
        System.out.println(sum);
        if (sum == originalNumber) {
            System.out.println("ArmstrongNumber");
        } else {
            System.out.println("Not an ArmstrongNumber");
        }
    }
}

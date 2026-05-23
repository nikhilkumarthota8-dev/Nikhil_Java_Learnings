package test_folder_practise.basic_folder;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int number = scan.nextInt();
        int rev = 0;
        int r;
        while (number > 0) {
            r = number % 10;  ///get the last number
            rev = rev * 10 + r; //// it will help in building
            number = number / 10; ////remove the last digit
        }
        System.out.println(rev);
    }

}

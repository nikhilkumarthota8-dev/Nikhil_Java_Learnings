package test_folder_practise.NewPractise;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("Reverse A Number java program:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number you want to reverse:");
        int number = scan.nextInt();
        int r;
        int rev = 0;
        while (number > 0) {
            r = number % 10;
            rev = (rev * 10) + r;
            number = number / 10;
        }
        System.out.println(rev);
    }
}

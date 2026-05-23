package conditions;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the year u want ot check:");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}

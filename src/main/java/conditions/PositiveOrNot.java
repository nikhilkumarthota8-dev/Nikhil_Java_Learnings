package conditions;

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("Entered Number is Positive Number");
        } else if (number < 0) {
            System.out.println("Entered Number is Negative Number");
        } else {
            System.out.println("Number is 0");
        }
    }
}

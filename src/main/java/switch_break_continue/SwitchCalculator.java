package switch_break_continue;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter a character symbol from - (+, -, *, /)");
        Scanner scan = new Scanner(System.in);
        String symbol = scan.nextLine();

        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();

        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();

        int result;
        switch (symbol) {
            case "+":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Please Enter a valid operator");
                break;
        }
    }
}

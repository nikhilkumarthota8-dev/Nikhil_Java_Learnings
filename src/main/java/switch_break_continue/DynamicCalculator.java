package oops;

import java.security.PublicKey;
import java.util.Scanner;

public class DynamicCalculator {
    static int n1;
    static int n2;
    static int result;
    static Scanner scan = new Scanner(System.in);

    public static int calc(String operation) {
        switch (operation) {
            case "add":
                result = n1 + n2;
                break;
            case "sub":
                result = n1 - n2;
                break;
            case "mul":
                result = n1 * n2;
                break;
            case "div":
                result = n1 + n2;
                break;
            default:
                System.out.println("Not a valid operation:");
                break;
        }
        return result;
    }

    public static void userInput() {
        System.out.println("Please first number:");
        n1 = scan.nextInt();
        System.out.println("Please second number");
        n2 = scan.nextInt();
        System.out.println("Choose operation(add,sub,mul,div):");
        String operation = scan.next();
        result = calc(operation);
        System.out.println("Result:" + result);
    }

    public static void main(String[] args) {
        userInput();
        System.out.println("Do you want to perform another operation? (Yes/No):");
        String yesorNo = scan.next();
        if (yesorNo.equalsIgnoreCase("Yes")) {
            userInput();
        }
        System.out.println("Thank you for using the calculator!");
    }

}

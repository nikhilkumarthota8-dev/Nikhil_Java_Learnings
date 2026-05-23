package operators;

import java.util.Scanner;

public class SmallestNumberInThreeTernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int number1 = scan.nextInt();
        System.out.println("Please enter number 2:");
        int number2 = scan.nextInt();
        System.out.println("Please enter number 3:");
        int number3 = scan.nextInt();

        int smallestNumber = (number1 < number2 && number1 < number3) ? number1 : (number2 < number1 && number2 < number3) ? number2 : number3;
        System.out.println(smallestNumber);
    }
}

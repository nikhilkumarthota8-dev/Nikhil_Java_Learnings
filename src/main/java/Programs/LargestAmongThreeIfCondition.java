package Programs;

import java.util.Scanner;

public class LargestAmongThreeIfCondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number 1");
        int number1 = scan.nextInt();
        System.out.println("Please Enter Number 2");
        int number2 = scan.nextInt();
        System.out.println("Please Enter Number 3");
        int number3 = scan.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Number 1 is largest: " + number1);
        } else if (number1 < number2 && number2 > number3) {
            System.out.println("Number 2 is largest: " + number2);
        } else {
            System.out.println("Number 3 is largest: " + number3);
        }
    }
}

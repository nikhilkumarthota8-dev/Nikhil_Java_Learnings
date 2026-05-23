package conditions;

import java.util.Scanner;

public class LargestAmongTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number 1:");
        int number1 = scan.nextInt();
        System.out.println("Please Enter Number 2:");
        int number2 = scan.nextInt();

        int largestNumber = (number1 > number2) ? number1 : number2;
        System.out.println(largestNumber);

    }


}

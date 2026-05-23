package Programs;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int factorial = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}

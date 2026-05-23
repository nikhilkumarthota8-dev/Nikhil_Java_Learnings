package Programs;

import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 number");
        int a = scan.nextInt();
        System.out.println("Please enter 1 number");
        int b = scan.nextInt();
        System.out.println("Before Swapping:" + "A value is " + a + " B value is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:" + "A value is " + a + " B value is " + b);
    }
}

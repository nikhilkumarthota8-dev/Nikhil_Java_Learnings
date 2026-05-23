package Programs;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 number");
        int a = scan.nextInt();
        System.out.println("Please enter 1 number");
        int b = scan.nextInt();
        System.out.println("Before Swapping:" + "A value is " + a + " B value is " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:" + "A value is " + a + " B value is " + b);

    }
}

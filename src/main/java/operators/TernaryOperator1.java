package operators;

import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int n1 = scan.nextInt();
        System.out.println("Please enter number 2:");
        int n2 = scan.nextInt();
        int largestNumber = (n1 > n2) ? n1 : n2;
        System.out.println(largestNumber);
    }
}

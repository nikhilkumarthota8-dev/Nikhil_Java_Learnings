package operators;

import java.util.Scanner;

public class TernaryOperator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int n1 = scan.nextInt();
        System.out.println("Please enter number 2:");
        int n2 = scan.nextInt();
        System.out.println("Please enter number 3:");
        int n3 = scan.nextInt();
        int largestNumber = (n1 > n2 && n1 > n3) ? n1 : (n1 < n2 && n3 < n2) ? n2 : n3;
        System.out.println(largestNumber);
    }
}

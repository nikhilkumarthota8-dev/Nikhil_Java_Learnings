package PractiseFolder;

import java.util.Scanner;

public class PrintTablesUsingWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        }
    }
}

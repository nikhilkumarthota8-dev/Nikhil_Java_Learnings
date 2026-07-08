package PractiseFolder;

import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Numbers: " + i);
            } else {
                System.out.println("Odd Number: " + i);
            }
        }
    }
}

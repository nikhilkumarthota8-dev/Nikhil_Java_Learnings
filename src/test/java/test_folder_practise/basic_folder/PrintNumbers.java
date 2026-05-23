package test_folder_practise.basic_folder;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int numberEntered = scan.nextInt();
        System.out.println("Please check the entered number:" + numberEntered);

        for (int i = 1; i <= numberEntered; i++) {
            System.out.println(i);
        }
    }
}

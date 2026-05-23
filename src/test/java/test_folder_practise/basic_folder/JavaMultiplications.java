package test_folder_practise.basic_folder;

import java.util.Scanner;

public class JavaMultiplications {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number for which you want multiplication table:");
        int numberEntered = scan.nextInt();
        System.out.println("Please check the entered number:" + numberEntered);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberEntered + "*" + i + "=" + (numberEntered * i));
        }
    }
}

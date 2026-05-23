package test_folder_practise.basic_folder;

import java.util.Scanner;

public class WhileLoopMultiplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number for which you want multiplication table:");
        int numberEntered = scan.nextInt();
        System.out.println("Please check the entered number:" + numberEntered);
        int i = 1;
        while (i <= 10) {
            System.out.println(numberEntered + "*" + i + "=" + (numberEntered * i));
            i++;
        }
    }
}

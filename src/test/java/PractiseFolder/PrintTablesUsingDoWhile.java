package PractiseFolder;

import java.util.Scanner;

public class PrintTablesUsingDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i = 1;
        do {
            System.out.println(number + "*" + i + "=" + (number * i));
            i++;
        }
        while (i <= 10);
    }
}

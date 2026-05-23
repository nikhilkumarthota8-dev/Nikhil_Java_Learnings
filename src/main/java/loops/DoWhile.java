package loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid number greater than 0:");
        int num = scan.nextInt();
        int i = 1;
        do {
            System.out.println(num + "*" + i + "=" + (num * i));
            i++;
        } while (i <= 10);
    }
}

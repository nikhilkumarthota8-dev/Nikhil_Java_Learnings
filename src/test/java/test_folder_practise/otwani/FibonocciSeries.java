package test_folder_practise.otwani;

import java.util.Scanner;

public class FibonocciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Number:");
        int number = scan.nextInt();
        System.out.print(n1 + "," + n2 + ",");
        for (int i = 1; i <= number; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if (i == number) {
                System.out.print(n3);
            } else {
                System.out.print(n3 + ",");
            }

        }

    }
}

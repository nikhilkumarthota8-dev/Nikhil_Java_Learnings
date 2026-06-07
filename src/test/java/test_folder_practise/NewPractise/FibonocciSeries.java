package test_folder_practise.NewPractise;

import java.util.Scanner;

public class FibonocciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 1; i <= number; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }
}

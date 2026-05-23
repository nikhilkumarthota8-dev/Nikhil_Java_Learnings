package test_folder_practise.otwani;

import java.util.Scanner;

public class AllPrimeNumbersFrom1To100 {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num + " Number is a Prime Number:");
            }

        }

    }
}

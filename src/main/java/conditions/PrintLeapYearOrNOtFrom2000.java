package conditions;

import java.util.Scanner;

public class PrintLeapYearOrNOtFrom2000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year from when?");
        int startYear = scan.nextInt();
        System.out.println("Enter the year to when?");
        int lastYear = scan.nextInt();

        for (int i = startYear; i <= lastYear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(i + " Lear Year:");
            } else {
                System.out.println(i + " Not a Lear Year:");
            }
        }

    }

}

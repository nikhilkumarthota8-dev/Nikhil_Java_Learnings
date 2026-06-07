package test_folder_practise.NewPractise;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter String:");
        String str = scan.nextLine();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;

        }
        System.out.println(rev);

    }
}

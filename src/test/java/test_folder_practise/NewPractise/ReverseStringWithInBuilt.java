package test_folder_practise.NewPractise;

import java.util.Scanner;

public class ReverseStringWithInBuilt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse().toString();
        System.out.println(sb);
    }
}

package test_folder_practise.practise;

import java.util.Scanner;

public class StringInBuilt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.nextLine();
        System.out.println("Entered String is: " + str);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse().toString();
        System.out.println(sb);
    }
}

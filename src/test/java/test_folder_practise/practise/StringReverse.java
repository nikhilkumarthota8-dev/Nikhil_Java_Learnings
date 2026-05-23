package test_folder_practise.practise;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.next();
        System.out.println("Entered String is: " + str);
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reverseString = ch + reverseString;
        }
        System.out.println(reverseString);
    }
}

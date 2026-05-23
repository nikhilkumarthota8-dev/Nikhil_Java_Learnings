package test_folder_practise.basic_folder;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String you want to reverse:");
        String str = scan.nextLine();
        String revString = "";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse().toString();
        System.out.println(sb);

    }

}

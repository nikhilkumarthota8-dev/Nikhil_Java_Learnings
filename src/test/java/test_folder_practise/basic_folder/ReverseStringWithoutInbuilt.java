package test_folder_practise.basic_folder;

import java.util.Scanner;

public class ReverseStringWithoutInbuilt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter String:");
        String str = scan.nextLine();
        String revString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            revString = ch + revString;
        }
        System.out.println(revString);

    }
}

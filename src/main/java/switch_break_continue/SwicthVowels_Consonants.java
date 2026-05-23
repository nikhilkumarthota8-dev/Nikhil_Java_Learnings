package switch_break_continue;

import java.util.Scanner;

public class SwicthVowels_Consonants {
    public static void main(String[] args) {
        System.out.println("Please enter a character in String");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c = str.charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowels:");
                break;
            default:
                // check if it's an alphabet
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    System.out.println(c + " is a Consonant");
                } else {
                    System.out.println(c + " is not an alphabet");
                }

        }

    }
}

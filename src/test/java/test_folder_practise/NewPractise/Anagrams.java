package test_folder_practise.NewPractise;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Both are Anagrams:");
        } else {
            System.out.println("Not an anagrams");
        }
    }
}

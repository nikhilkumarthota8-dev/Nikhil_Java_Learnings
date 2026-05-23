package test_folder_practise.practise;

import java.util.Arrays;

public class AnagramsOrNot {
    public static void main(String[] args) {
        String s1 = "Silent";
        String s2 = "Listen";

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println("Both Are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}

package test_folder_practise.otwani;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String str1 = "Silent";
        String str2 = "Listen";

        String newStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String newStr2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] c1 = newStr1.toCharArray();
        char[] c2 = newStr2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not an Anagrams");
        }
    }
}

package test_folder_practise.practise1Strings;

import java.util.Arrays;

public class ReverseCharactersInsideEachWordInAString {
    public static void main(String[] args) {
        String name = "Thota Nikhil kumar";
        String[] stringArray = name.split(" ");
        System.out.println(Arrays.toString(stringArray));
        for (String stringname : stringArray) {
            String reversed = new StringBuilder(stringname).reverse().toString();
            System.out.print(reversed + " ");
        }
    }
}

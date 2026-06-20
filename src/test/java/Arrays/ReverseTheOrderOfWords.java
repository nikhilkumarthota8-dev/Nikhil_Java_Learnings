package Arrays;

import java.util.Arrays;

public class ReverseTheOrderOfWords {
    public static void main(String[] args) {
        String name = "This is Nikhil Kumar Thota";
        String[] nameWords = name.split(" ");

        for (int i = nameWords.length - 1; i >= 0; i--) {
            System.out.print(nameWords[i] + " ");
        }
    }
}

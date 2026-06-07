package test_folder_practise.NewPractise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseCharactersInAword {
    public static void main(String[] args) {
        String str = "This is Nikhil Kumar";
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));
        for (String word : str1) {
            String rev = new StringBuilder(word).reverse().toString().toLowerCase();
            System.out.print(rev + " ");
        }
    }
}

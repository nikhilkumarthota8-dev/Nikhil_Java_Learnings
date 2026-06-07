package test_folder_practise.NewPractise;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "This is Nikhil Kumar";
        String[] str1 = str.split(" ");
        int length = str1.length;
        System.out.println(length);
        System.out.println(Arrays.toString(str1));
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i] + " ");
        }
    }
}

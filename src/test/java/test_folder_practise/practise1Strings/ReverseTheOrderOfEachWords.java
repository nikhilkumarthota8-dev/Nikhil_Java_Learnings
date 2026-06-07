package test_folder_practise.practise1Strings;

import java.util.Arrays;

public class ReverseTheOrderOfEachWords {
    public static void main(String[] args) {
        String name = "Thota Nikhil kumar";
        String[] stringArray = name.split(" ");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i] + " ");
        }
    }
}

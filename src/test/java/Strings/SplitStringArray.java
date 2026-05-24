package Strings;

import java.util.Arrays;

public class SplitStringArray {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grape", "Oranges", "Strawberry"};
        System.out.println(Arrays.toString(fruits));
        int length = fruits.length;
        System.out.println(length);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}

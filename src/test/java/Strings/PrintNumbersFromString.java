package Strings;

import java.util.Arrays;

public class PrintNumbersFromString {
    public static void main(String[] args) {

        String stringNumbers = "1,2,3,4,5";
        String[] numbersList = stringNumbers.split(",");
        System.out.println(Arrays.toString(numbersList));
        int length = numbersList.length;
        System.out.println(length);
        int[] intNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            intNumbers[i] = Integer.parseInt(numbersList[i]);
        }
        for (int num : intNumbers) {
            System.out.println(num);
        }
    }
}

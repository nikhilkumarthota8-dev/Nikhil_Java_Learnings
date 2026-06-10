package Arrays;

import java.util.Arrays;

public class MergeTwoStrings {
    public static void main(String[] args) {
        String[] items1 = {"TV", "Sofa", "Fridge"};
        String[] items2 = {"Washing Machine", "Hair Dryer"};

        String[] merged = new String[items1.length + items2.length];
        for (int i = 0; i < items1.length; i++) {
            merged[i] = items1[i];
        }
        for (int j = 0; j < items2.length; j++) {
            merged[items1.length + j] = items2[j];
        }
        System.out.println(Arrays.toString(merged));
    }
}

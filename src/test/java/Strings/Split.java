package Strings;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String str = "Nikhil Kumar Thota";
        System.out.println(str);
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));

        for(String name:str1){
            System.out.println(name);
        }
    }
}

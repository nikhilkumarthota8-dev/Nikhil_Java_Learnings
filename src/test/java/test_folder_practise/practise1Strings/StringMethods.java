package test_folder_practise.practise1Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Thota Nikhil Kumar";
        String name1 = "Thota Nikhil Kumar";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.replace(" ", ""));
        System.out.println(name);
        System.out.println(name.replaceAll(" ", ""));
        System.out.println(name.charAt(2));
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.equals(name1));

        String[] stringArray = name.split(" ");
        System.out.println(Arrays.toString(stringArray));

        char[] charArray = name.toCharArray();
        System.out.println(charArray);

        System.out.println(name.isBlank());
        System.out.println(name.indexOf('h'));
        System.out.println(name.lastIndexOf('t'));
        System.out.println(name.trim());
        System.out.println(name.substring(0, 5));
        System.out.println(name.concat(name1));
        System.out.println(name + name1);
        System.out.println(name.indexOf("Nikhil"));
    }
}

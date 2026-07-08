package PractiseFolder;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name1 = "Thota Nikhil Kumar";
        String name2 = "THOTA NIKHIL KUMAR";

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both are equal in equalIgnore case");
        } else {
            System.out.println("Not equals both string name1 and name2");
        }

        String name3 = name1.toLowerCase();
        String name4 = name2.toLowerCase();
        System.out.println(name3);
        System.out.println(name4);

        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.charAt(1));
        System.out.println(name1.replaceAll(" ", ""));
        System.out.println(name1.replace('T', 't'));
        System.out.println(name1.substring(0, 5));
        System.out.println(name1.trim());
        String[] stringArray = name1.split(" ");
        System.out.println(Arrays.toString(stringArray));
        String junkValues = "!@#$%(#&^&$*(%&*($12345";
        System.out.println(junkValues.replaceAll("[^a-zA-Z0-9]", ""));
    }

}

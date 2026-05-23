package utilities;

import java.util.Random;

public class RandomNumbers {
    static Random r = new Random();

    public static void main(String[] args) {
        randomNumber();
        randomCharacter();
        randomString(10);
    }

    public static void randomNumber() {
        int number = r.nextInt(100);
        System.out.println(number);
    }

    public static void randomCharacter() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c = str.charAt(r.nextInt(str.length()));
        System.out.println(c);
    }

    public static void randomString(int noOfCharacters) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < noOfCharacters; i++) {
            char c = str.charAt(r.nextInt(str.length()));
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}




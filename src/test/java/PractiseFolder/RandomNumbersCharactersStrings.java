package PractiseFolder;

import java.util.Random;

public class RandomNumbersCharactersStrings {
    public static void main(String[] args) {

        Random r = new Random();
        int randomNumber = r.nextInt(100);
        System.out.println(randomNumber);
        randomCharacters();
        System.out.println(randomString(10));

    }

    public static char randomCharacters() {
        Random r = new Random();
        String alpabhets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c = alpabhets.charAt(r.nextInt(alpabhets.length()));
        System.out.println(c);
        return c;
    }

    public static String randomString(int size) {
        Random r = new Random();
        String alpabhets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            char c = alpabhets.charAt(r.nextInt(alpabhets.length()));
            sb.append(c);
        }
        return sb.toString();
    }
}

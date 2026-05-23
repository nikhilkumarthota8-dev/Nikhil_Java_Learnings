package test_folder_practise.basic_folder;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(randomNumber(r));
        System.out.println(randomChar(r));
        System.out.println(randomStringGenerated(r, 10));

    }

    public static int randomNumber(Random r) {
        int randomNumberGenerated = r.nextInt(100);
        return randomNumberGenerated;
    }

    public static char randomChar(Random r) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = str.length();
        System.out.println(length);
        char randomCharacterGenerated = str.charAt(r.nextInt(length));
        return randomCharacterGenerated;
    }

    public static String randomStringGenerated(Random r, int lengthOfString) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = str.length();
        System.out.println(length);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lengthOfString; i++) {
            char ch = str.charAt(r.nextInt(length));
            sb.append(ch);
        }
        return sb.toString();
    }


}

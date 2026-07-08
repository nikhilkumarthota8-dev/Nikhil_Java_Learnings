package PractiseFolder;

public class CountNumberOfDigits {
    public static void main(String[] args) {

        int number = 123456789;
        int count = 0;
        int reverseNumber = 0;
        int r;
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}

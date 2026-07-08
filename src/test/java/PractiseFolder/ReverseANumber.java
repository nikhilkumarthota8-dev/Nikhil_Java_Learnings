package PractiseFolder;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 123456789;
        int reverseNumber = 0;
        int r;
        while (number > 0) {
            r = number % 10;
            reverseNumber = (reverseNumber * 10) + r;
            number = number / 10;
        }
        System.out.println(reverseNumber);
    }
}

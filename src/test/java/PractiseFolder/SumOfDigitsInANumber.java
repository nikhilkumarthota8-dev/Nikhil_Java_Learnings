package PractiseFolder;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {

        int number = 123456789;
        int reverseNumber = 0;
        int r;
        int sum = 0;

        while (number > 0) {
            r = number % 10;
            sum = sum + r;
            number = number / 10;
        }
        System.out.println(sum);
    }
}

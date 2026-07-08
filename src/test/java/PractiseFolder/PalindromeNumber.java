package PractiseFolder;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321;
        int originalNumber = number;
        int reverseNumber = 0;
        int r;
        while (number > 0) {
            r = number % 10;
            reverseNumber = (reverseNumber * 10) + r;
            number = number / 10;
        }
        System.out.println(reverseNumber);
        if (reverseNumber == originalNumber) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

}

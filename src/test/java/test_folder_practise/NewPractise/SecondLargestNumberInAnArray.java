package test_folder_practise.NewPractise;

public class SecondLargestNumberInAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5000, 6, 78, 88, 99, 101, 1002};
        int maxNumber = numbers[0];
        int secondMaxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = numbers[i];
            } else if (secondMaxNumber < numbers[i] && maxNumber > secondMaxNumber) {
                secondMaxNumber = numbers[i];
            }
        }
        System.out.println("Max Number: " + maxNumber);
        System.out.println("Second Max Number: " + secondMaxNumber);
    }
}
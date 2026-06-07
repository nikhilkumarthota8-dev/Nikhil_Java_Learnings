package test_folder_practise.NewPractise;

public class MaxNumberInAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 78, 88, 99, 101, 1002};
        int maxNumber = numbers[0];
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Max Number: " + maxNumber);
        System.out.println("Max Index: " + maxIndex);
    }
}

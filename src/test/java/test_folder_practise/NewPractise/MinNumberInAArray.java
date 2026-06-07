package test_folder_practise.NewPractise;

public class MinNumberInAArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, -1, 78, 88, 99, 101, 1002};
        int minNumber = numbers[0];
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Max Number: " + minNumber);
        System.out.println("Max Index: " + minIndex);
    }
}

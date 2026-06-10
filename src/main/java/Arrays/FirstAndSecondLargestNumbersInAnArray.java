package Arrays;

public class FirstAndSecondLargestNumbersInAnArray {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 58, 98, 87, 345, 987, 845};

        int maxNumber = numbers[0];
        int secondMaxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                secondMaxNumber = maxNumber;
                maxNumber = numbers[i];
            } else if (secondMaxNumber < numbers[i] && maxNumber > secondMaxNumber) {
                secondMaxNumber = numbers[i];
            }
        }
        System.out.println(maxNumber);
        System.out.println(secondMaxNumber);
    }
}

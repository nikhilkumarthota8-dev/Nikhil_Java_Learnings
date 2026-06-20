package Arrays;

public class SecondMaxNumberInAnArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 60, 50};
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

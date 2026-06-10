package Arrays;

public class MinNumberInAnArray {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int minNumber = numbers[0];
        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                minIndex = i;
            }
        }
        System.out.println(minNumber);
        System.out.println(minIndex);
    }
}

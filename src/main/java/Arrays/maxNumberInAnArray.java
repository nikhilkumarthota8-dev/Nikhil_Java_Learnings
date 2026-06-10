package Arrays;

public class maxNumberInAnArray {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int maxNumber = numbers[0];
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println(maxNumber);
        System.out.println(maxIndex);
    }
}

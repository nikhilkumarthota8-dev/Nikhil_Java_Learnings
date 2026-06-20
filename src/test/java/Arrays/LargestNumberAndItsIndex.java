package Arrays;

public class LargestNumberAndItsIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
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

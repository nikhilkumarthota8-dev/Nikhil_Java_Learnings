package Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int avg = 0;

        for (int number : numbers) {
            sum = sum + number;
        }
        avg = sum / numbers.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}

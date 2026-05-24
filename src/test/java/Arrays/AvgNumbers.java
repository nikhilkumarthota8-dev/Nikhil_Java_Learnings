package Arrays;

public class AvgNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}

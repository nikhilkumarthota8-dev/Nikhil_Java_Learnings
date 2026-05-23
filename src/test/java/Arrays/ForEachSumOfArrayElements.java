package Arrays;

public class ForEachSumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int arrayOfElements : arr) {
            sum = sum + arrayOfElements;
        }
        System.out.println(sum);
    }
}

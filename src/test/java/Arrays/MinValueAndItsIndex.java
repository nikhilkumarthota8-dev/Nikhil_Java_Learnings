package Arrays;

public class MinValueAndItsIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 921, 234, 567, 875, 789654, 90876334};
        int minNumber = arr[0];
        int minIndex = 0;

        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        System.out.println(minNumber);
    }
}

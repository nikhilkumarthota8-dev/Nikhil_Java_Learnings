package Arrays;

public class MaxValueAndItsIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 921, 234, 567, 875, 789654, 90876334};
        int maxNumber = arr[0];
        int maxIndex = 0;

        for (int i = 1; i <= arr.length - 1; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        System.out.println(maxNumber);
    }
}

package test_folder_practise.practise;

public class MinimumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9, 764, 2335, 5467, 4563,0};
        int minNumber = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        System.out.println(minNumber);
    }
}

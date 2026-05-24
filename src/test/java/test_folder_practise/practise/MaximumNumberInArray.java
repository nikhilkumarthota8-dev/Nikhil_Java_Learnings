package test_folder_practise.practise;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9, 764, 2335, 5467, 4563};
        int maxNumber = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        System.out.println(maxNumber);
    }
}

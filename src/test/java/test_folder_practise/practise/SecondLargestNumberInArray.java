package test_folder_practise.practise;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 44562, 5, 8, 9, 764, 2335, 5467, 4563, 0};
        int maxNumber = arr[0];
        int maxIndex = 0;
        int secondMaxNumber = arr[0];
        int secondMaxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
                maxIndex = i;
            } else if ((secondMaxNumber < arr[i]) && (secondMaxNumber != maxNumber)) {
                secondMaxNumber = arr[i];
                secondMaxIndex = i;

            }
        }

        System.out.println("MaxNumber:" + maxNumber);
        System.out.println("MaxIndex:" + maxIndex);
        System.out.println("MinNumber:" + secondMaxNumber);
        System.out.println("MinIndex:" + secondMaxIndex);

    }
}

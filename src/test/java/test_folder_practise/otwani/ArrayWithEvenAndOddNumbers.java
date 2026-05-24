package test_folder_practise.otwani;

public class ArrayWithEvenAndOddNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] originalArray = new int[50];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = i + 1;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }
        System.out.println(" ");
        System.out.println("evenCount: " + evenCount);
        System.out.println("oddCount: " + oddCount);
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int eIndex = 0;
        int oIndex = 0;
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenArray[eIndex++] = num;
            } else {
                oddArray[oIndex++] = num;
            }
        }
        System.out.println("Original Array (1 to 50): ");
        printArray(originalArray);
        System.out.println("Even Numbers Array: " );
        printArray(evenArray);
        System.out.println("Odd Numbers Array: ");
        printArray(oddArray);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

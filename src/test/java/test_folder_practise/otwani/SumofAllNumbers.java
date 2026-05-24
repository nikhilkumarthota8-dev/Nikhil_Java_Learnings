package test_folder_practise.otwani;

public class SumofAllNumbers {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.print("Array Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ",");
            }
            sum = sum + numbers[i];
        }
        System.out.println();
        System.out.println("Sum of all integers in the array: " + sum);
    }
}

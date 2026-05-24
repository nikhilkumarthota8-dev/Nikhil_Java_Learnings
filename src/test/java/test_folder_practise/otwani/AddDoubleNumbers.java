package test_folder_practise.otwani;

public class AddDoubleNumbers {

    public static void main(String[] args) {

        double[] numbers = {10.0, 20.0, 30.0, 40.0, 50.0};

        System.out.println("Array values: " + numbers[0] + "," + numbers[1] + "," + numbers[2] + "," + numbers[3] + ","
                + numbers[4]);
        double firstElement = numbers[0];
        double secondElement = numbers[1];
        double thirdElement = numbers[2];
        double fourthElement = numbers[3];
        double fifthElement = numbers[4];

        double result = firstElement + secondElement + thirdElement + fourthElement + fifthElement;
        System.out.println("The sum of array elements: " + result);
        if (result >= 150) {
            System.out.println("The sum is greater than or equal to 150.0");
        } else {
            System.out.println("The sum is less than 150.0");
        }
    }

}

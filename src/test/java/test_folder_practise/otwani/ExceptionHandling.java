package test_folder_practise.otwani;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Index You want to retrieve: ");

        try {
            int number = scan.nextInt();
            int indexNumber = numbers[number];
            System.out.println(indexNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :" + e.getMessage());
            System.out.println("Index is out of range: enter a valid index between 0 and 2");
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        }
        scan.close();
    }
}

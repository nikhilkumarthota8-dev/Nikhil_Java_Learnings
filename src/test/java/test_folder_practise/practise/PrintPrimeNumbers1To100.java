package test_folder_practise.practise;

public class PrintPrimeNumbers1To100 {
    public static void main(StringLength[] args) {
        for (int number = 2; number <= 100; number++) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);
            }
        }
    }
}

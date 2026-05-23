package test_folder_practise.practise;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 23};
        int sum = 0;

        for (int number : numbers1) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}

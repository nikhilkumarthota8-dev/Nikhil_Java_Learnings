package Arrays;

public class Arrays2Dimensions {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];

        numbers[0][0] = 2;
        numbers[0][1] = 5;

        numbers[1][0] = 7;
        numbers[1][1] = 8;

        numbers[2][0] = 9;
        numbers[2][1] = 10;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

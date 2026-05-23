package test_folder_practise.practise;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] numbersList = {1, 2, 34, 5, 57, 9543, 34364, 245, 8756, 928};
        int maxNumber = numbersList[0];
        int maxIndex = 0;

        for (int i = 1; i < numbersList.length; i++) {
            if (maxNumber < numbersList[i]) {
                maxNumber = numbersList[i];
                maxIndex = i;
            }
        }
        System.out.println(maxNumber);
        System.out.println(maxIndex);
    }
}

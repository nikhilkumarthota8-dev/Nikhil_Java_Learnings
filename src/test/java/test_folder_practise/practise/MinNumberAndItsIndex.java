package test_folder_practise.practise;

public class MinNumberAndItsIndex {
    public static void main(String[] args) {

        int[] numbersList = {1, 23, 45, 6, 65465783, 23424354, 45432, 0, -1};
        int minNumber = numbersList[0];
        int minIndex = 0;

        for (int i = 1; i < numbersList.length; i++) {
            if (minNumber > numbersList[i]) {
                minNumber = numbersList[i];
                minIndex = i;
            }
        }
        System.out.println(minNumber);
        System.out.println(minIndex);
    }
}

package Arrays;

public class ShortestWordInAStringArray {
    public static void main(String[] args) {
        String[] items = {"coffee", "Tea", "Milk", "Juice", "WM"};
        String shortestWord = items[0];
        int shortestWordIndex = 0;
        for (int i = 1; i < items.length; i++) {
            if (shortestWord.length() > items[i].length()) {
                shortestWord = items[i];
                shortestWordIndex = i;
            }
        }
        System.out.println(shortestWord);
        System.out.println(shortestWordIndex);

    }
}

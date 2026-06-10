package strings;

public class ShortestWordInAnStringArray {
    public static void main(String[] args) {
        String[] items = {"Coffeee", "Tea", "Chai", "Juice"};
        System.out.println(items.length);
        String shortestWord = items[0];
        int shortWordIndex = 0;
        for (int i = 0; i < items.length; i++) {
            if (shortestWord.length() > items[i].length()) {
                shortestWord = items[i];
                shortWordIndex = i;
            }
        }
        System.out.println(shortestWord);
        System.out.println(shortWordIndex);
    }
}

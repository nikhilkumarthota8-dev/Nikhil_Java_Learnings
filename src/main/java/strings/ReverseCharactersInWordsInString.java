package strings;

public class ReverseCharactersInWordsInString {
    public static void main(String[] args) {

        String str = "Nikhil kumar Thota";
        String[] names = str.split(" ");
        for (String name : names) {
            String st = new StringBuilder(name).reverse().toString();
            System.out.print(st + " ");
        }

    }
}

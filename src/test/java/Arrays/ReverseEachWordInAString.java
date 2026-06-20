package Arrays;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        String names = "This is Nikhil kumar Thota";
        String[] nameWords = names.split(" ");
        for (String name : nameWords) {
            String str = new StringBuilder(name).reverse().toString();
            System.out.print(str + " ");
        }
    }
}

package strings;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String str = "Nikhil kumar Thota";
        String newStr = str.replaceAll("\\s", "");
        System.out.println(newStr);
    }
}

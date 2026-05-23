package strings;

public class ReplaceJunkValues {
    public static void main(String[] args) {
        String str = "!@#$%^&*&@*Thota Nikhil Kumar!@#$%^&*(()";
        String replacedNewString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("New String After removing junk Values:" + replacedNewString);
    }
}

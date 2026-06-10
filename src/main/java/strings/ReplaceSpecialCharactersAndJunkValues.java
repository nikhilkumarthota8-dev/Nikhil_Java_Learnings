package strings;

public class ReplaceSpecialCharactersAndJunkValues {
    public static void main(String[] args) {
        String str = "132456728938gshjkwqquieo!@#$%^!&*(@)??>:{}|@#$%^&*()";
        String newString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(newString);
    }
}

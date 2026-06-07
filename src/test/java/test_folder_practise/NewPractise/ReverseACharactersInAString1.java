package test_folder_practise.NewPractise;

public class ReverseACharactersInAString1 {
    public static void main(String[] args) {
        String str = "This is Nikhil kumar";
        String rev = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}

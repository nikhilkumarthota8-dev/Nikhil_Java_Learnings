package test_folder_practise.NewPractise;

public class ReverseAStringCharacters {
    public static void main(String[] args) {
        String str = "This is Nikhil Kumar";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse().toString();
        System.out.println(sb);
    }
}

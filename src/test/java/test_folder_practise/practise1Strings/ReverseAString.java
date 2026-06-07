package test_folder_practise.practise1Strings;

public class ReverseAString {
    public static void main(String[] args) {

        String name = "Nikhil kumar Thota";
        String reversed = "";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            reversed = c + reversed;
        }
        System.out.println(reversed);
    }
}

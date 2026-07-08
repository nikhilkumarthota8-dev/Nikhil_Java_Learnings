package PractiseFolder;

public class ReverseStringWithoutInbuilt {
    public static void main(String[] args) {
        String name = "Thota Nikhil kumar";
        String reverse = "";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            reverse = c + reverse;
        }
        System.out.println(reverse);
    }
}

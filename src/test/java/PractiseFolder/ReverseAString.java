package PractiseFolder;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Thota Nikhil Kumar";
        String reversed;

        StringBuffer sb = new StringBuffer(name);
        reversed = sb.reverse().toString();
        System.out.println(reversed);

    }
}

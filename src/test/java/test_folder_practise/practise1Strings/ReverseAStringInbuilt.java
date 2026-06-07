package test_folder_practise.practise1Strings;

public class ReverseAStringInbuilt {
    public static void main(String[] args) {

        String name = "Thota Nikhil Kumar";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb.toString());

    }
}

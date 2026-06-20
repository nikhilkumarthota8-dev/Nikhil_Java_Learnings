package test_folder_practise.practise1Strings;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }

    }
}

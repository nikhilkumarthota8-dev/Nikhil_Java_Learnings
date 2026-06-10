package strings;

public class PrintCharacters {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i = (i + 2)) {
            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                System.out.print(ch);
            }
        }
    }
}

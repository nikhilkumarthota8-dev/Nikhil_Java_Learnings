package strings;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "abcdefABCDEF-&^&*(5421";
        int smallLettersCount = 0;
        int capitalLettersCount = 0;
        int specialCharactersCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                capitalLettersCount++;
            } else if (Character.isLowerCase(ch)) {
                smallLettersCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                specialCharactersCount++;
            }
        }
        System.out.println(smallLettersCount);
        System.out.println(capitalLettersCount);
        System.out.println(numberCount);
        System.out.println(specialCharactersCount);

    }
}

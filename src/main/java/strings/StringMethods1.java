package strings;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "Om Namah Shivaya";
        String str2 = "Om Namah Shivaya";
        System.out.println("Upper Case:" + str1.toUpperCase() + " " + str2.toUpperCase());
        System.out.println("Lower Case:" + str1.toLowerCase() + " " + str2.toLowerCase());
        boolean isEqualorNot = str1.equalsIgnoreCase(str2);
        System.out.println(isEqualorNot);

        boolean isEqualAddressOrNot = str1 == str2;
        System.out.println(isEqualAddressOrNot);

    }
}

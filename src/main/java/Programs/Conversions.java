package Programs;

public class Conversions {
    public static void main(String[] args) {
        int number = 123;

        // Method 1: Using String.valueOf()
        String str1 = String.valueOf(number);
        System.out.println(str1);

        // Method 2: Using Integer.toString()
        String str2 = Integer.toString(number);
        System.out.println(str2);

        // Method 3: Concatenation (quick trick)
        String str3 = number + "";
        System.out.println(str3);


        /////////String to int///////
        String str = "123";

        // Method 1: Using Integer.parseInt()
        int num1 = Integer.parseInt(str);
        System.out.println(num1);

        // Method 2: Using Integer.valueOf()
        int num2 = Integer.valueOf(str);
        System.out.println(num2);


    }
}

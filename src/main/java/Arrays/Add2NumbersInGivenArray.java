package Arrays;

public class Add2NumbersInGivenArray {
    public static void main(String[] args) {
        int[] number = {15, 25, 35, 45, 65};

        System.out.println("First Element: " + number[0]);
        System.out.println("Second Element: " + number[1]);
        System.out.println("Third Element: " + number[2]);
        System.out.println("Fourth Element: " + number[3]);
        System.out.println("Fifth Element: " + number[4]);
        int add = number[0] + number[number.length - 1];
        System.out.println("Sum of the first and last elements: " + add);
        if (add >= 100) {
            System.out.println("The sum is greater than or equal to 100.");
        } else {
            System.out.println("The sum is less than 100.");
        }

    }
}

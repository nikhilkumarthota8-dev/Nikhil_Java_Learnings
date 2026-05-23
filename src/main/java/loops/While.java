package loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid number greater than 0:");
        int num = scan.nextInt();
        if (num > 0) {
            int i = 1;
            while (i <= 10) {
                System.out.println(num + "*" + i + "=" + (num * i));
                i++;
            }
        } else {
            System.out.println("Please enter a valid int above 0.");
        }
    }
}

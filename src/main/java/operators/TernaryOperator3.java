package operators;

import java.util.Scanner;

public class TernaryOperator3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter student marks:");
        int marks = scan.nextInt();

        String grade = (marks > 80) ? "A" : (marks > 60) ? "B" : (marks > 40) ? "C" : "Fail";

        System.out.println("Marks: " + marks + " → Grade: " + grade);
    }
}



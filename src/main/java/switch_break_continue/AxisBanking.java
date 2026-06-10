package switch_break_continue;

import java.util.Scanner;

public class AxisBanking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0;
        int choice;
        do {
            System.out.println("Please Enter your choice:");
            System.out.println("1.Balance Check:");
            System.out.println("2.Withdraw:");
            System.out.println("3.Deposit:");
            System.out.println("4.Statement:");
            System.out.println("5.Exit:");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance Check:" + balance);
                    break;
                case 2:
                    System.out.println("Withdraw :" + balance);
                    System.out.println("Enter the amount you want to withdraw:");
                    double withdraw = scan.nextDouble();
                    if (balance > withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Balance after withdrawing: " + balance);
                    } else {
                        System.out.println("The entered amount is greater than balance amount: so withdraw is not possible:");
                    }
                    break;
                case 3:
                    System.out.println("Deposit :" + balance);
                    System.out.println("Enter the amount you want to deposit:");
                    double deposit = scan.nextDouble();
                    balance = balance + deposit;
                    System.out.println(balance);
                    break;
                case 4:
                    System.out.println("Statement :" + balance);
                    System.out.println("The amount you have in your account is:");
                    System.out.println(balance);
                    break;
                case 5:
                    System.out.println("Exit :");
                    break;
            }
        }
        while (choice != 5);
    }

}

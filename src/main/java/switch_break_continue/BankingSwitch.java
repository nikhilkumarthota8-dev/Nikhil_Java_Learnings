package switch_break_continue;

import java.util.Scanner;

public class BankingSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        do {
            System.out.println("Please Enter your choice from below options:");
            System.out.println("1 - Balance check:");
            System.out.println("2 - Deposit:");
            System.out.println("3 - Withdraw:");
            System.out.println("4 - Exit:");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have selected Balance check:");
                    balance = balance;
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.println("You have selected Deposit: Please enter deposit amount");
                    double deposit = scan.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Balance after deposit:" + balance);
                    break;
                case 3:
                    System.out.println("You have selected Withdraw: Please enter withdraw amount");
                    double withdraw = scan.nextDouble();
                    if (balance > withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Balance after withdraw:" + balance);
                    } else {
                        System.out.println("Insufficient Balance to withdraw amount:" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Exit Please take your card");
                    System.out.println("Thanks for visiting");
                    break;
                default:
                    System.out.println("Enter a valid option from available list 1-4");
                    break;
            }
        }
        while (choice != 4);
        scan.close();
    }
}

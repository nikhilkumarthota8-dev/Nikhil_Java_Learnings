package switch_break_continue;

import java.util.Scanner;

public class AxisBankingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        do {
            System.out.println("Welcome to AXIS Bank");
            System.out.println("Please select your option:");
            System.out.println("1 ----> Balance Check");
            System.out.println("2 ----> Withdraw");
            System.out.println("3 ----> Deposit");
            System.out.println("4 ----> EXIT");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have selected the Balance check option:");
                    balance = balance;
                    System.out.println("Balance:" + balance);
                    break;
                case 2:
                    System.out.println("You have selected the Withdraw option:");
                    System.out.println("Please enter amount you want to Withdraw:");
                    double withdraw = scan.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance:" + balance);
                    } else {
                        balance = balance - withdraw;
                        System.out.println("After withdraw Balance:" + balance);
                    }
                    break;
                case 3:
                    System.out.println("You have selected the Deposit option:");
                    System.out.println("Please enter amount you want to deposit:");
                    double deposit = scan.nextDouble();
                    balance = balance + deposit;
                    System.out.println("After Deposit Balance:" + balance);
                    break;
                case 4:
                    System.out.println("You have selected the EXIT option:");
                    break;
                default:
                    System.out.println("Please select the valid option from 1-4");
                    break;
            }

        } while (choice != 4);
    }
}

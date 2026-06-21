package switch_break_continue;

import java.util.Scanner;

public class GroceryItems {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String itemName = "";
        int price;
        int quantity;
        int totalCost = 0;
        int finalBill = 0;
        int choice;
        do {
            System.out.println("Do you want to enter the more Items? 1 for yes and 2 for No");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the item Name");
                    itemName = scan.next();
                    System.out.println("Enter the item Price");
                    price = scan.nextInt();
                    System.out.println("Enter the item Quantity");
                    quantity = scan.nextInt();
                    totalCost = price * quantity;
                    System.out.println("Total for " + itemName + " is = " + totalCost);
                    finalBill = finalBill + totalCost;
                    break;

                case 2:
                    System.out.println("Final Amount Bill: " + finalBill);
                    break;
            }

        }
        while (choice != 2);
    }
}

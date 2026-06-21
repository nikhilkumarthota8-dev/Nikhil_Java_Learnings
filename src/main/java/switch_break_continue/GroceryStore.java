package switch_break_continue;

import java.util.Scanner;

public class GroceryStore {
    static String name;
    static double itemPrice;
    static double quantity;
    static double total;
    static double totalprice = 0.0;
    static String choice;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the item name:");
            name = scan.next();
            System.out.println("Enter the price of the item:₹");
            itemPrice = scan.nextDouble();
            System.out.println("Enter the quantity of the item:");
            quantity = scan.nextDouble();
            total = itemPrice * quantity;
            totalprice = totalprice + total;
            System.out.println("Total for " + name + ":₹" + total);
            System.out.println("Do you want to add another item?(Yes/No):");
            choice = scan.next();
        } while (choice.equalsIgnoreCase("Yes"));
        System.out.println("Final Total Bill:" + totalprice);
    }

}

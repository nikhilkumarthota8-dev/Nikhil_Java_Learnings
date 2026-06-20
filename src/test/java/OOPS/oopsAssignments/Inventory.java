package OOPS.oopsAssignments;

public class Inventory {

    public String itemName;
    public int quantity;
    public double price;

    public static void main(String[] args) {

        Inventory i1 = new Inventory();
        i1.itemName = "Laptop";
        i1.quantity = 10;
        i1.price = 1200.50;

        System.out.println("Item Name:" + i1.itemName);
        System.out.println("Quantity:" + i1.quantity);
        System.out.println("Price:$" + i1.price);

        Inventory i2 = new Inventory();
        i2.itemName = "Mobile";
        i2.quantity = 20;
        i2.price = 800.50;

        System.out.println("Item Name:" + i2.itemName);
        System.out.println("Quantity:" + i2.quantity);
        System.out.println("Price:$" + i2.price);
    }

}

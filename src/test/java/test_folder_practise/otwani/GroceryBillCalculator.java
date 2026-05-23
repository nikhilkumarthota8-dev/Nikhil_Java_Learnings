package test_folder_practise.otwani;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        int rice = 50;
        int sugar = 30;
        int tea = 20;

        System.out.println("Total Grocery Bill: " + (rice + sugar + tea));

        int TotalCapacity = 1000;
        int litresUsed = 350;
        System.out.println("Remaining water: " + (TotalCapacity - litresUsed));

        //BODMAS
        int itemCost = 100;
        int quantity = 3;
        int deliveryFees = 40;
        int discount = 20;
        int gst = 18;

        double total1 = ((100 * 3) + 40 - 20) + 18;
        System.out.println("Final Bill with GST: ₹" + total1);
    }
}

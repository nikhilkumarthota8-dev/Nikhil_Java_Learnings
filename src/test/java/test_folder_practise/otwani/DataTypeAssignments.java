package test_folder_practise.otwani;

public class DataTypeAssignments {
    public static void main(String[] args) {
        byte battery = 85;
        System.out.println("Batter: " + battery + "%");

        short noOfUnits = 100;
        int unitCost = 7;
        System.out.println("Your total electricity bill is: " + (noOfUnits * unitCost));

        long population = 1250000;
        System.out.println("City Population is: " + population);

        String device = "Laptop";
        char c = device.charAt(0);
        System.out.println("Product starts with: " + c);
    }
}

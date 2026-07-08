package PractiseFolder;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 11;
        int n3 = 80;

        if (n1 > n2 && n1 > n3) {
            System.out.println("N1 is largest: " + n1);
        } else if (n1 < n2 && n2 > n3) {
            System.out.println("N2 is largest: " + n2);
        } else {
            System.out.println("N3 is largest: " + n3);
        }
    }
}

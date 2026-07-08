package PractiseFolder;

public class TernaryFor3Variables {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 23;
        int n3 = 16;

        int largestNumber = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.println(largestNumber);
    }
}

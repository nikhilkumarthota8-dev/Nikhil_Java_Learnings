package test_folder_practise.NewPractise;

import java.util.Scanner;

public class PrintNumbersTillRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
    }
}

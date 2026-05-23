package test_folder_practise.basic_folder;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int number = scan.nextInt();
        int r;
        int count=0;
        while(number>0){
            number=number/10;
            count ++;
        }

        System.out.println(count);
    }
}

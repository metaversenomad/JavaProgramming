package practice_day02;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal number:");
        double num2 = input.nextDouble();

        System.out.println("Enter a word:");
        String str = input.next();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);


    }
}

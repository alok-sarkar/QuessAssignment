package Day1_31_05;

import java.util.Scanner;

public class Q2SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double amount=sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years=sc.nextInt();
        double interest=((amount*7.5)/100)*years;
        System.out.println("Simple Interest: "+interest);
        System.out.println("Total amount: "+(amount+interest));
    }
}

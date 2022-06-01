package Day2_01_06;

import java.util.Scanner;

public class Q23_MultipleTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
        for (int num = start; num <= end; num++) {
            System.out.println("===============");
            System.out.println("Table of "+num);
            System.out.println("===============");
            for (int i = 1; i<= 10; i++) {
                System.out.println(num+" X "+i+" = "+num*i);
            }
        }
    }
}

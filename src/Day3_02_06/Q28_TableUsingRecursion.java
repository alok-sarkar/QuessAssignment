package Day3_02_06;

import java.util.Scanner;

public class Q28_TableUsingRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        printTable(num,10);
    }
    static void printTable(int num, int n){
        if (n==0)
            return;
        printTable(num,n-1);
        System.out.println(num+" X "+n+" = "+num*n);
    }
}

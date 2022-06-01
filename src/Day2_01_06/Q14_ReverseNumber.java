package Day2_01_06;

import java.util.Scanner;

public class Q14_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Reversed: "+new StringBuilder(Integer.toString(num)).reverse());
    }
}

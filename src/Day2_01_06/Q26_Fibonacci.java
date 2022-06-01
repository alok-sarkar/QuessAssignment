package Day2_01_06;

import java.util.Scanner;

public class Q26_Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int a=1,b=1;
        while (a <= num) {
            System.out.print(a+" ");
            b+=a;
            a=b-a;
        }
    }
}

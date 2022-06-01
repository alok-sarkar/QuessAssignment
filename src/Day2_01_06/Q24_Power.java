package Day2_01_06;

import java.util.Scanner;

public class Q24_Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print("Enter the exponent: ");
        int ex= sc.nextInt();
        int result =1;
        for (int i = 1; i <= ex; i++)
            result*=num;
        System.out.println(num+"^"+ex+" = "+result);
    }
}

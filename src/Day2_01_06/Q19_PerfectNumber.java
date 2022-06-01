package Day2_01_06;

import java.util.Scanner;

public class Q19_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num>1) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number");
                return;
            }

        }
            System.out.println(num+" is not a perfect number");
    }
}

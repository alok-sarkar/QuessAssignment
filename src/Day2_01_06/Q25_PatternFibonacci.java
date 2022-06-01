package Day2_01_06;

import java.util.Scanner;

public class Q25_PatternFibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int a=1,b=1;
            for (int j = 0; j < i; j++) {
                System.out.print(a+"\t");
                b+=a;
                a=b-a;
            }
            System.out.println();
        }
    }
}

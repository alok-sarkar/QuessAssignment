package Day2_01_06;

import java.util.Scanner;

public class Q27_FactorUsingConstructor {
    public Q27_FactorUsingConstructor(int n) {
        System.out.print("factors are:");
        for (int i = 1; i <= n; i++) {
            if (n%i==0)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        Q27_FactorUsingConstructor a=new Q27_FactorUsingConstructor(num);
    }
}

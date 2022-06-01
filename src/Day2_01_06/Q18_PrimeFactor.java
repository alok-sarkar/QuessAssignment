package Day2_01_06;

import java.util.Scanner;

public class Q18_PrimeFactor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print("Prime factors of "+num+" are: ");
        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.print(i+" ");
                num = num/i;
            }
        }
        if(num>1)
            System.out.println(num);
    }
}

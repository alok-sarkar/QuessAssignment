package Day2_01_06;

import java.util.Scanner;

public class Q12_PrimeInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
        x: for (int num = start; num < end; num++) {
            if(num==2)
                System.out.print("2 ");
            if(num%2==0)
                continue;
            if(num>2){
                for (int i = 3; i <= Math.sqrt(num); i+=2) {
                    if(num%i==0){
                        continue x;
                    }
                }
                System.out.print(num+" ");
            }
        }

    }
}

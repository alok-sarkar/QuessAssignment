package Day4_03_06;

import java.util.Scanner;

public class Q36_NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int upperBound=sc.nextInt();
        int num = 2;
        x: for (int count=0; count < upperBound; num++) {
            if(num==2){
//                System.out.print(num+" ");
                count++;
            }
            if(num%2==0)
                continue;
            if(num>2){
                for (int i = 3; i <= Math.sqrt(num); i+=2) {
                    if(num%i==0){
                        continue x;
                    }
                }
//                System.out.print(num+" ");
                count++;
            }
        }
        System.out.println(upperBound+"th prime number: "+(num-1));
    }
}

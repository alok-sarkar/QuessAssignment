package Day2_01_06;

import java.util.Scanner;

public class Q11_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0){
            if(num==2)
                System.out.println(num+" is a prime number");
            else
                System.out.println(num+" is not a prime number");
            return;
        }

        if(num>2){
            for (int i = 3; i <= Math.sqrt(num); i+=2) {
                if(num%i==0){
                    System.out.println(num+" is not a prime number");
                    return;
                }
            }
            System.out.println(num+" is a prime number");
        }
    }
}

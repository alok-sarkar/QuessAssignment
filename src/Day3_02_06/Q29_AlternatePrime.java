package Day3_02_06;

import java.util.Scanner;

public class Q29_AlternatePrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int end=sc.nextInt();
        boolean toggle=true;
        x: for (int num = 2; num < end; num++) {
            if(num==2){
                System.out.print("2 ");
                toggle=!toggle;
            }

            if(num%2==0)
                continue;
            if(num>2){
                for (int i = 3; i <= Math.sqrt(num); i+=2) {
                    if(num%i==0){
                        continue x;
                    }
                }
                if(toggle)
                    System.out.print(num+" ");
                toggle=!toggle;
            }
        }
    }
}

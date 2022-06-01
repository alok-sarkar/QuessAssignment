package Day2_01_06;

import java.util.Scanner;

public class Q21_ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
        System.out.print("Armstrong numbers in the range are: ");
        for (int num = start; num <= end; num++) {
            int count=0,temp=0,dup=num;
            int ex= Integer.toString(num).length();
            while (dup!=0){
                temp+=Math.pow((dup%10),ex);
                dup/=10;
            }
            if(temp==num)
                System.out.print(num+" ");
        }
    }
}

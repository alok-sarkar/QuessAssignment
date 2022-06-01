package Day2_01_06;

import java.util.Scanner;

public class Q16_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int count=0,temp=0,dup=num;
        int ex= Integer.toString(num).length();
        while (dup!=0){
            temp+=Math.pow((dup%10),ex);
            dup/=10;
        }
        if(temp==num){
            System.out.println(num+" is an Armstrong number");
        }else
            System.out.println(num+" is not an Armstrong number");
    }
}

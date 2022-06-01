package Day1_31_05;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int count=0,temp=0,dup=num;
        while (dup!=0){
            temp+=Math.pow((dup%10),3);
            dup/=10;
        }
        if(temp==num){
            System.out.println("Armstrong number");
        }else
            System.out.println("Not a Armstrong number");
    }
}

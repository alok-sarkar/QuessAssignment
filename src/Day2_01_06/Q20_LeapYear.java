package Day2_01_06;

import java.util.Scanner;

public class Q20_LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        boolean isLeapYear=false;
        if(num%4==0){
            if (num%100==0){
                if(num%400==0)
                    isLeapYear=true;
            }else
                isLeapYear=true;

        }
        if(isLeapYear)
            System.out.println(num+" is a leap year");
        else
            System.out.println(num+" is not a leap year");
    }
}

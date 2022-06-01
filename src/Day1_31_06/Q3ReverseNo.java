package Day1_31_06;

import java.util.Scanner;

public class Q3ReverseNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a three digit number : ");
        int num=sc.nextInt();
        //We Could Use The String builder
        StringBuilder str=new StringBuilder(Integer.toString(num)).reverse();
        System.out.println("Reversed value{String method}: "+str);
        // or the Manual by-division method
        int result=(num%10)*100;
        num/=10;
        result+=(num%10)*10;
        num/=10;
        result+=(num%10);
        System.out.println("Reversed value{integer method}: "+result);
    }
}

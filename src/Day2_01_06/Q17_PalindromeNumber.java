package Day2_01_06;

import java.util.Scanner;

public class Q17_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        String str1=Integer.toString(num);
        String str2=new StringBuilder(Integer.toString(num)).reverse().toString();
        if(str1.compareTo(str2)==0){
            System.out.println(num+" is a palindrome number");
        }else
            System.out.println(num+" is not a palindrome number");
    }
}

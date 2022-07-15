package Day32_13_07;

import java.util.Scanner;

public class StringNumberMultiplication {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = scan.nextLine();
        System.out.print("Enter second number: ");
        String num2=scan.nextLine();
        System.out.println("Product: "+multiply(num1,num2));
    }
    static String multiply(String num1, String num2){
        String result="0";
        num2=new StringBuilder(num2).reverse().toString();

        int tens=0;
        for (char letter: num2.toCharArray()) {
            int multiplier=Character.getNumericValue(letter);
            String oneSum="";
            for (int i = 1; i <= multiplier; i++) {
                oneSum=sum(oneSum,num1);
                System.out.println(oneSum);
            }
            for (int i = 0; i < tens; i++) {
                oneSum+="0";
            }
            System.out.println(oneSum);
            result=sum(result,oneSum);
            tens++;
        }
        return result;
    }
    static String sum(String str1, String str2){
        StringBuilder result= new StringBuilder();
        int i,carry=0;
        for ( i= 0; i < str2.length() && i<str1.length(); i++) {
            int firstValue= Character.getNumericValue(str1.charAt(str1.length() - i - 1));
            int secondValue=Character.getNumericValue(str2.charAt(str2.length() - i - 1));
            int addedValue= firstValue + secondValue +carry;
            carry=addedValue/10;
            addedValue%=10;
            result.insert(0,addedValue);
        }

        if(str1.length()-i>0){ // if the 1st number is greater
            for ( ; i<str1.length(); i++) {
                int addedValue=Character.getNumericValue(str1.charAt(str1.length()-i-1))+carry;
                carry=addedValue/10;
                addedValue%=10;
                result.insert(0,addedValue);
            }
        }
        if(str2.length()-i>0){// if the second number is greater
            for ( ; i<str2.length(); i++) {
                int addedValue=Character.getNumericValue(str2.charAt(str2.length()-i-1))+carry;
                carry=addedValue/10;
                addedValue%=10;

                result.insert(0,addedValue);
            }
        }
        if (carry!=0)// last carry added at first
            result.insert(0,carry);
        return result.toString();
    }
}

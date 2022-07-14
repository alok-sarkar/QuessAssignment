package Day28_07_07;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first number: ");
        String num1 =scan.nextLine();
        System.out.print("Enter second number: ");
        String num2 =scan.nextLine();
        int sum;
        try{
            sum=Integer.parseInt(num1,2)+Integer.parseInt(num2,2);
        }catch (NumberFormatException e){
            System.out.println("Invalid input, Enter only binary string");
            return;
        }

        System.out.println("Sum: "+Integer.toBinaryString(sum));
    }
}

package Day6_07_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q40_TwoExceptionHandler {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        try {
            System.out.print("Enter X:");
            int x=scan.nextInt();
            System.out.print("Enter Y:");
            int y=scan.nextInt();
            System.out.println(x+"/"+y+" = "+x/y);
        }catch (ArithmeticException e){
            System.out.println("Y can't be zero.");
        }catch (InputMismatchException e){
            System.out.println("Invalid Input.");
        }
    }
}

import java.util.Scanner;

public class Q8GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3=sc.nextInt();
        int res=(num1>num2) ? ((num1>num3)?num1:num3) : ((num2>num3)?num2:num3);
        System.out.println("Greatest of three numbers is: "+res);
    }
}

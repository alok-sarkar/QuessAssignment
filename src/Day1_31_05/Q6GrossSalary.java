package Day1_31_05;

import java.util.Scanner;

public class Q6GrossSalary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic=sc.nextDouble();
        double ta=basic*.10;
        double da=basic*.15;
        double hra=basic*.2;
        double pf=basic*.12;
        double bonus=(basic>=20000)?basic*.10:basic*.20;
        System.out.println( "Gross Salary: "+(basic+ta+da+hra+bonus-pf));
    }
}

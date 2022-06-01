package Day1_31_05;

import java.util.Scanner;

public class Q7InsuranceEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        System.out.print("Enter Sex[M/F]: ");
        char gender=sc.next().charAt(0);
        System.out.print("Enter Marital Status[Married/Unmarried]: ");
        sc.nextLine();
        String mStatus;
        boolean inValid=false;
        do {
            if(inValid)
                System.out.println("Enter either \"Married\" or \"Unmarried\"");
            mStatus=sc.nextLine().toLowerCase();
            inValid=!(mStatus.compareTo("married")==0 || mStatus.compareTo("unmarried")==0);
        }while (inValid);
        boolean eligible=true;
        if(mStatus.compareTo("unmarried")==0){
            if(Character.toLowerCase(gender)=='m' && age<=30){
                eligible=false;
            }else if(Character.toLowerCase(gender)=='f' && age<=25){
                eligible=false;
            }
        }
        if (eligible)
            System.out.println("You are eligible for insurance");
        else
            System.out.println("You are not eligible for insurance");
    }
}

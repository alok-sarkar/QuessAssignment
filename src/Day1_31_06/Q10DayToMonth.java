package Day1_31_06;

import java.util.Scanner;

public class Q10DayToMonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int days=sc.nextInt();
        System.out.println(days+" days = "+days/30+" months & "+days%30+" days");
    }
}

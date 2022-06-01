package Day1_31_05;

import java.util.Scanner;

public class Q5ValidTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st angle : ");
        int deg1=sc.nextInt();
        System.out.print("Enter 2nd angle : ");
        int deg2=sc.nextInt();
        System.out.print("Enter 3rd angle : ");
        int deg3=sc.nextInt();
        if(deg1+deg2+deg3==180)
            System.out.println("It is a triangle");
        else
            System.out.println("It is not a triangle");
    }
}

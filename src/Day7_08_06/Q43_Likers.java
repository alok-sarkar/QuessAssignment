package Day7_08_06;

import java.util.Scanner;

public class Q43_Likers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int numberOfPeople=scan.nextInt();
        String[] people=new String[numberOfPeople];
        if(numberOfPeople>0){
            scan.nextLine();
            for (int i = 0; i < numberOfPeople; i++) {
                System.out.print("Enter person "+(i+1)+"'s name: ");
                people[i]=scan.nextLine();
            }
        }

        displayLikers(people);
    }
    static void displayLikers(String[] likers){
        if(likers.length<1) System.out.println("No one likes this");
        else if (likers.length<2) System.out.println(likers[0]+" likes this");
        else if (likers.length<3) System.out.println(likers[0]+" and "+likers[1]+" likes this");
        else if (likers.length<4) System.out.println(likers[0]+","+likers[1]+" and "+likers[2]+" likes this");
        else System.out.println(likers[0]+","+likers[1]+" and "+(likers.length-2)+" others likes this");
    }
}

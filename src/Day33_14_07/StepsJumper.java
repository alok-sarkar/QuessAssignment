package Day33_14_07;

import java.util.ArrayList;
import java.util.Scanner;

public class StepsJumper {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number of positions : ");
        int positions=scan.nextInt();

        int[] jumpValue= new int[positions];
        System.out.print("Enter the jumps for each position: ");
        for(int currPos=0; currPos<positions; currPos++)
            jumpValue[currPos]=scan.nextInt();

        int reachablePos = 0;
        boolean check=true;
        for(int currPos = 0;currPos < positions; currPos++){
            System.out.print(reachablePos +" < " +currPos+"="+ (reachablePos < currPos)+"=>");
            if(reachablePos < currPos){ //if we can't cross current position
                check=false;
                break;
            }
            reachablePos = Math.max(reachablePos, currPos + jumpValue[currPos]);
            System.out.println(" reachablePos=" +reachablePos);
            if(reachablePos>=positions-1)
                break;
        }
        System.out.println("\n"+check);
    }

}

package Day7_08_06;

import java.util.Scanner;

public class Q44_HighestScoringWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=scan.nextLine();
        int highestSum=0;
        String winnerWord=null;
        System.out.print("Scores of each  : ");
        for (String word : str.split(" ")) {
            int sum=0;
            System.out.print("[");
            for (char character : word.toCharArray()) {
                sum+=((int)character-96);
                System.out.print(((int)character-96)+",");
            }
            System.out.print("]->"+sum+"  ");
            if(sum>highestSum){
                highestSum=sum;
                winnerWord=word;
            }
        }
        System.out.println();
        System.out.println("Highest Scoring Word: "+winnerWord);
    }
}

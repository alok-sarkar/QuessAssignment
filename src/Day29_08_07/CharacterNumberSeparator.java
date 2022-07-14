package Day29_08_07;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterNumberSeparator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=scan.nextLine();
        StringBuilder digitList=new StringBuilder();
        for (Character letter :str.toCharArray()) {
            if( (int)letter>47 && (int)letter<58){
                digitList.append(letter);
            }else{
                System.out.print(letter);
            }
        }
        System.out.println(digitList);
    }
}

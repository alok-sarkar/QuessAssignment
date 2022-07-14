package Day29_08_07;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=scan.nextLine();
        HashMap<Character,Integer> map= new HashMap<>();
        for (Character letter :str.toCharArray()) {
            if(map.containsKey(letter)){
                map.put(letter, map.get(letter)+1);
            }else{
                map.put(letter,1);
            }
        }
        map.forEach((letter,occurrence)-> System.out.println(letter+" occurred "+occurrence+" times"));

    }
}

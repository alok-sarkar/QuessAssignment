package Day7_08_06;

import java.util.Scanner;

public class Q42_DigitReplacer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string of Digit: ");
        String str=scan.nextLine();
        System.out.println("Converted String: "+DigitConverter(str));
    }
    static String DigitConverter(String str){
        StringBuilder resultString= new StringBuilder();
        for (char digit : str.toCharArray()) {
            if(Integer.parseInt(Character.toString(digit))<5)
                resultString.append("0");
            else
                resultString.append("1");
        }
        return resultString.toString();
    }
}

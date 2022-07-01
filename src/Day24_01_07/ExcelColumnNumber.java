package Day24_01_07;

import java.util.Scanner;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the column title: ");
        String columnTitle =scan.nextLine();
        System.out.println("Column Number: "+getColumnNumber(columnTitle));
    }

    private static int getColumnNumber(String columnTitle) {
        columnTitle = columnTitle.toUpperCase();
        int columnNumber=0;
        int i=0;
        while (columnTitle.length()>0){
            int letterValue =getValue(columnTitle.substring(columnTitle.length()-1));
//            System.out.println(letterValue+" X "+Math.pow(26,i));
            columnNumber+=Math.pow(26,i)* letterValue;
            columnTitle = columnTitle.substring(0, columnTitle.length()-1);
            i++;
        }
        return columnNumber;
    }

    private static int getValue(String letter) {
        char character=letter.charAt(0);
//        System.out.println(letter+" -> "+((int)character-64));
        return  (int)character-64;
    }
}

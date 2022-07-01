package Day24_01_07;

import java.util.Scanner;

public class ZigZagConverter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the string: ");
        String input=scan.nextLine();


        System.out.println("Converted value: "+convert(input,rows));
    }

    private static String convert(String input, int rows) {
        if (input == null || rows == 0) {
            return "";
        }

        // base case
        if (rows == 1)
        {
            return input;
        }

        StringBuilder str= new StringBuilder();

        // for first row
        for (int i = 0; i < input.length(); i += (rows-1)*2) {
            str.append(input.charAt(i));
        }

        // for middle rows
        for (int j = 1; j < rows - 1; j++)
        {
            boolean down = true;
            for (int i = j; i < input.length();)
            {
                str.append(input.charAt(i));
                if (down) {     // going down
                    i += (rows - j - 1) * 2;
                }
                else {          // going up
                    i += (rows - 1) * 2 - (rows - j - 1) * 2;
                }

                down = !down;   // switch direction
            }
        }

        // for the last row
        for (int i = rows - 1; i < input.length(); i += (rows - 1) * 2) {
            str.append(input.charAt(i));
        }

        return str.toString();

    }

}

package Day7_08_06;

import java.util.Scanner;
class InvalidCredentials extends Exception{
    InvalidCredentials(String error){
        super(error);
    }
}

public class Q41_UsernamePasswordVerifier {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        try {
            System.out.print("Enter Username: ");
            String usrName=scan.nextLine();
            if(usrName.length()<6 || usrName.length()>15){
                throw new InvalidCredentials("Invalid Username: Username must be 6-15 in length");
            }
            if(Character.isLowerCase(usrName.charAt(0))){
                throw new InvalidCredentials("Invalid Username: First letter must be in upper case");
            }
            if(usrName.contains("(")||usrName.contains(")")){
                throw new InvalidCredentials("Invalid Username: Username cannot contain parenthesis");
            }
            if(usrName.contains(" ")){
                throw new InvalidCredentials("Invalid Username: Username cannot contain spaces");
            }


            System.out.print("Enter Password: ");
            String passWord=scan.nextLine();
            if(passWord.length()<8 || passWord.length()>256){
                throw new InvalidCredentials("Invalid Password: Password must be 8-256 in length");
            }
            if(passWord.contains("(")||passWord.contains(")")){
                throw new InvalidCredentials("Invalid Password: Password cannot contain parenthesis");
            }
            if(passWord.contains(" ")){
                throw new InvalidCredentials("Invalid Password: Password cannot contain space");
            }


            if(usrName.compareToIgnoreCase(passWord)==0){
                throw new InvalidCredentials("Invalid Username/Password: Username & Password can't be same");
            }
        }catch (InvalidCredentials e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("You are good to go.");

    }
}

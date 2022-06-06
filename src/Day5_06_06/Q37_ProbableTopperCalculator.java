package Day5_06_06;

import java.util.Scanner;
/* THE QUESTION
* In the University Examinations conducted during the past 5 years, the toppers registration regNobers were 7126, 82417914, 7687 and 6657.
* Your father is an expert in data mining and he could easily infer a pattern in the toppers registration regNobers.
* In all the registration regNobers listed here, the sum of the odd digits is equal to the sum of the even digits in the regNober.
* He termed the regNobers that satisfy this property as Probable Topper regNobers.
* Write a program to find whether a given regNober is a probable topper regNober or not.
* Input: 143
* Output: yes
*/
public class Q37_ProbableTopperCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the registration number: ");
        int regNo= scan.nextInt();
        int oddSum=0,evenSum=0;
        while (regNo>0){
            int digit= regNo%10;
            if(digit%2==0)
                evenSum+=digit;
            else
                oddSum+=digit;
            regNo/=10;
        }
        if(oddSum==evenSum)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

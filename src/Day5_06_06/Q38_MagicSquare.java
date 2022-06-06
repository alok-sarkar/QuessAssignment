package Day5_06_06;

import java.util.Scanner;

public class Q38_MagicSquare {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of rows/column: ");
        int rowColumNo= scan.nextInt();
        int[][] arr= new int[rowColumNo][rowColumNo];
        System.out.println("Enter the Elements: ");
        for (int row = 0; row < rowColumNo; row++) {
            for (int col = 0; col < rowColumNo; col++) {
                arr[row][col]=scan.nextInt();
            }
        }

        int refSum=0;
        for (int row = 0; row < rowColumNo; row++) {
            refSum+=arr[0][row];
        }

        for (int row = 0; row < rowColumNo; row++) {
            int rowSum=0,columnSum=0;
            for (int col = 0; col < rowColumNo; col++) {
                rowSum+=arr[row][col];
                columnSum+=arr[col][row];
            }
            if(rowSum!=refSum || columnSum!=refSum){
                System.out.println("No");
                return;
            }
        }

        int forwardDiagonalSum=0,backwardDiagonalSum=0;
        for (int row = 0; row < rowColumNo; row++) {
            forwardDiagonalSum+=arr[row][row];
            backwardDiagonalSum+=arr[rowColumNo-row-1][rowColumNo-row-1];
        }
        if(forwardDiagonalSum!=refSum || backwardDiagonalSum!=refSum){
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}

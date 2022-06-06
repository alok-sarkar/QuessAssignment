package Day5_06_06;

import java.util.Scanner;

public class Q38_MagicSquare {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of rows/column: ");
        int rowColumNo= scan.nextInt();
        int[][] arr= new int[rowColumNo][rowColumNo];
        for (int i = 0; i < rowColumNo; i++) {
            for (int j = 0; j < rowColumNo; j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        int refSum=0;
        for (int i = 0; i < rowColumNo; i++) {
            refSum+=arr[0][i];
        }

        for (int i = 0; i < rowColumNo; i++) {
            int rowSum=0,columnSum=0;
            for (int j = 0; j < rowColumNo; j++) {
                rowSum+=arr[i][j];
                columnSum+=arr[j][i];
            }
            if(rowSum!=refSum || columnSum!=refSum){
                System.out.println("No");
                return;
            }
        }

        int forwardDiagonalSum=0,backwardDiagonalSum=0;
        for (int i = 0; i < rowColumNo; i++) {
            forwardDiagonalSum+=arr[i][i];
            backwardDiagonalSum+=arr[rowColumNo-i-1][rowColumNo-i-1];
        }
        if(forwardDiagonalSum!=refSum || backwardDiagonalSum!=refSum){
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}

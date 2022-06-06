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

//        System.out.println(refSum);
        for (int i = 0; i < rowColumNo; i++) {
            int rowSum=0;
            for (int j = 0; j < rowColumNo; j++) {
                rowSum+=arr[i][j];
            }
            if(rowSum!=refSum){
                //System.out.println("No in row-wise");
                System.out.println("No");
                return;
            }
        }
        for (int i = 0; i < rowColumNo; i++) {
            int columnSum=0;
            for (int j = 0; j < rowColumNo; j++) {
                columnSum+=arr[j][i];
            }
            if(columnSum!=refSum){
                //System.out.println("No in column-wise");
                System.out.println("No");
                return;
            }
        }
        int forwardDiagonalSum=0;
        for (int i = 0; i < rowColumNo; i++) {
            forwardDiagonalSum+=arr[i][i];
        }
        if(forwardDiagonalSum!=refSum){
//            System.out.println("No in forward Diagonal");
            System.out.println("No");
            return;
        }
        int backwardDiagonalSum=0;
        for (int i = rowColumNo-1; i >=0 ; i--) {
            backwardDiagonalSum+=arr[i][i];
        }
        if(backwardDiagonalSum!=refSum){
            //System.out.println("No in backward Diagonal");
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}

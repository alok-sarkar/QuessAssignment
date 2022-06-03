package Day4_03_06;

import java.util.Scanner;

public class Q35_TransposeArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter  no. of columns: ");
        int col=sc.nextInt();
        System.out.print("Enter no. of rows: ");
        int row=sc.nextInt();
        int[][] arr=new int[row][col];
        int[][] res= new int[col][row];
        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Original Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i]= arr[i][j];
            }
        }
        System.out.println("Transposed Array: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}

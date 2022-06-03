package Day4_03_06;

import java.util.Scanner;

public class Q30_ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter "+(i+1)+"th element: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Reversed order: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

package Day4_03_06;

import java.util.Scanner;

public class Q31_CopyArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements=sc.nextInt();
        int[] arr1=new int[numberOfElements],arr2=new int[numberOfElements];
        System.out.print("Enter the number of elements: ");
        for (int i = 0; i < numberOfElements; i++) {
            arr1[i]=sc.nextInt();
        }
        System.arraycopy(arr1, 0, arr2, 0, numberOfElements);
        System.out.print("First array: ");
        for (int el :
                arr1) {
            System.out.print(el+" ");
        }
        System.out.println();
        System.out.print("Second array: ");
        for (int el :
                arr2) {
            System.out.print(el+" ");
        }

    }
}

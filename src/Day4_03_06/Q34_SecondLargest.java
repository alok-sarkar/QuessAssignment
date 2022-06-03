package Day4_03_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q34_SecondLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements=sc.nextInt();
        if(numberOfElements>0){
            Set<Integer> set= new HashSet<>();
            System.out.print("Enter the Elements: ");
            for (int i = 0; i < numberOfElements; i++) {
                set.add(sc.nextInt());
            }
            Integer[]arr=set.toArray(new Integer[0]);
            Arrays.sort(arr);
            int val;
            if(arr.length<2)
                val=arr[0];
            else
                val=arr[arr.length-2];
            System.out.println("Second Highest Value: "+val);
        }
        else
            System.out.println("Invalid input");
    }
}

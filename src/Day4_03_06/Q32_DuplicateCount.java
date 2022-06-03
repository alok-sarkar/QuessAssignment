package Day4_03_06;

import java.util.HashMap;
import java.util.Scanner;

public class Q32_DuplicateCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i = 0; i < numberOfElements; i++) {
            arr[i]=sc.nextInt();
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else 
                mp.put(arr[i],1);
        }
        int count=0;
        for(Integer element: mp.values()) {
            if(element>1)
                count++;
        }
        System.out.println("Number of duplicate values are: "+count);
        
    }
}

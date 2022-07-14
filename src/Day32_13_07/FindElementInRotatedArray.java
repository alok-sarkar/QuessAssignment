package Day32_13_07;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementInRotatedArray {
    public static void main(String[] args) {
//        int[] arr={4,5,6,7,0,1,2};
//        int[] arr={4,5,6,6,7,0,1,2,4,4};
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size=scan.nextInt();
        int[] arr= new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the target: ");
        int target=scan.nextInt();
        System.out.println(findElement(arr,target)+ " from Array: "+ Arrays.toString(arr));
    }
    static String findElement(int[] arr, int target){
        int start=0,end=arr.length-1;// range of sub array
        int steps=0;// for counting the steps
        while (start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target)
                return "Found at position: "+mid+", in "+(steps+1)+" Steps";
            if ((arr[start] == arr[mid]) && (arr[end] == arr[mid])){ //for duplicates
                start++;
                end--;
            }else if(arr[start]<=arr[mid]){// left side is sorted
                if(target>=arr[start] && target<=arr[mid]){// shrinking to [start-mid] -> sorted territory
                    end=mid-1;
                }
                else{// shrinking to [mid-end]--> unsorted territory
                    start=mid+1;
                }
            }
            else {//left is not sorted so right is sorted
                if(target>=arr[mid] && target<=arr[end]){// shrinking to [mid-end] -> sorted territory
                    start=mid+1;
                }else{// shrinking to [start-mid]--> unsorted territory
                    end=mid-1;
                }
            }
            steps++;
        }
        return "Not found"+" in "+steps+" Steps";
    }
}

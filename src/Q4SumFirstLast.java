import java.util.Scanner;

public class Q4SumFirstLast {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        //Using string
        String str=Integer.toString(num);
        int res=Integer.parseInt(String.valueOf(str.charAt(0)))
                +Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
        System.out.println("Sum{String method}: "+res);
        //using integer
        int sum=num%10;
        num/=1000;
        sum+=num;
        System.out.println("Sum{Integer method}: "+sum);
    }
}

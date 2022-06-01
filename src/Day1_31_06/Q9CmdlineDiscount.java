package Day1_31_06;

public class Q9CmdlineDiscount {
    public static void main(String[] args) {
        if (args.length>1) {
            double price=Double.parseDouble(args[0]);
            int quantity=Integer.parseInt(args[1]);
            double bill=price*quantity;
            if(quantity>=10){
                bill-=(bill*.1);
            }
            bill=(double) Math.round(bill * 100) / 100;
            System.out.println("Final amount: "+bill);
        }else{
            System.out.println("Insufficient argument");
        }
    }
}

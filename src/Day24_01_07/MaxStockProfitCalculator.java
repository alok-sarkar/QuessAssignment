package Day24_01_07;

import java.util.Scanner;

public class MaxStockProfitCalculator {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int size= scan.nextInt();
        int[] sharePrices =new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            sharePrices[i]=scan.nextInt();
        }

        System.out.println("Max profit that we can achieve: "+maxProfit(sharePrices));
    }

    private static int maxProfit(int[] SharePrices) {
        if(SharePrices ==null|| SharePrices.length<=1)
            return 0;

        int minimumPriceTillToday = SharePrices[0]; // initial minimum price
        int greatestProfit =0;// initial profit

        for(int i = 1; i< SharePrices.length; i++){
            int todaysPrice=SharePrices[i];
            int profitIfWeSellToday = todaysPrice - minimumPriceTillToday;
            greatestProfit = Math.max(greatestProfit, profitIfWeSellToday); // if we can make greater profit
            minimumPriceTillToday = Math.min(minimumPriceTillToday, todaysPrice); //tracking the minimum value throughout the array
        }

        return greatestProfit;
    }
}

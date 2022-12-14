package Marika;

public class MaxProfit {

    public static int maxProfit(int [] prices) { //O(n2) - O(1)
        if(prices.length == 0) return 0;

       int maxProfit = 0;
        for (int i = 0; i < prices.length ; i++) {
            for (int j = i+1; j < prices.length ; j++) {
               int profit = prices[j] - prices[i];
               maxProfit = Math.max(maxProfit, profit);
            }
        }
         return maxProfit;
    }

    public static int maxProfit1(int [] prices) { //  O(n) - O(1)
        if(prices.length == 0) return 0;

        int min=prices[0];
        int profit=0;

        for(int i=1; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);

        }

        return profit;
    }



    public static void main(String[] args) {

        int [] prices = {7,1,5,3,6,4};
        int [] prices1 = {7,6,5,4};
        System.out.println(maxProfit1(prices));


    }
}

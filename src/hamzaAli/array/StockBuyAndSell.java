package hamzaAli.array;
public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("(bruteForce)arr1 profit: $" + withBruteForce(prices1));
        System.out.println("(bruteForce)arr2 profit: $" + withBruteForce(prices2));

    }

    public static int withBruteForce(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    int diff = prices[j] - prices[i];
                    if (diff > max) {
                        max = diff;
                    }
                }
            }
        }
        return max;
    }

    public static int maxProfit(int[] prices) {
        // initialize minimum price to buy
        int minBuy = prices[0];
        // initialize maximum profit
        int profit = 0;
        // Traverse all element through a for loop
        for (int i = 1; i < prices.length; i++) {
            // Get the minimum price to buy
            minBuy = Math.min(minBuy, prices[i]);
            // Get the max profit
            profit = Math.max(profit, prices[i] - minBuy);
        }
        // return the profit
        return profit;
    }

}

package ARRAYS;

public class BuySellStocks {

  public static int buySellStocks(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int prices[] = { 7, 14, 1, 5, 8, 6 };
    System.out.println(buySellStocks(prices));
  }
}

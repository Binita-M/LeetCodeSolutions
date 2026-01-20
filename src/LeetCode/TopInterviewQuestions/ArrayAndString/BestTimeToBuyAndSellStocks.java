package LeetCode.TopInterviewQuestions.ArrayAndString;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //find minimum price
        for (int price: prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            //
            int profit = price - minPrice;

            //find maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
      return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStocks bttbass = new BestTimeToBuyAndSellStocks();

        //int[] prices = {7,1,5,3,6,4};
        //int result = bttbass.maxProfit(prices);

        int[] prices = {7,6,4,3,1};
        int result = bttbass.maxProfit(prices);

        System.out.println(result);
    }

}

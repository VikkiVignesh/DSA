package LeetCode.Interview_150;

public class Buy_SellStocks_I {
    public int maxProfit(int[] prices) {
        int stock=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<stock)
            {
                stock=prices[i];
            }
            else if(prices[i]-stock>profit)
            {
                profit=prices[i]-stock;
            }
        }
        return profit;
    }
}

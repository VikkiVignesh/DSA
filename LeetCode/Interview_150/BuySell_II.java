public class BuySell_II {
   public static void main(String[] args) {

    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int currStock=prices[0];

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]> currStock)
            {
                maxProfit+=prices[i]-currStock;
            }
            currStock=prices[i];
        }
        return maxProfit;
    }
}
   
}

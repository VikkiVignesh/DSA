package Greedy_Algo;

public class Stocks {
    public static int getMaxPrice(int p[])
    {
        int profit=0;
        int purStock=p[0];

        for(int i=1;i<p.length;i++)
        {
            if(p[i]<purStock)
            {
                purStock=p[i];
            }
            else if(p[i]-purStock > profit)
            {
                profit=p[i]-purStock;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        System.out.println(getMaxPrice(prices));
    }
}

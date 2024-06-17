/*Buy and Sell Stocks
  You are given a Array prices where prices[i] is the price of stock in ith day.You want to maximise the profit by buying one stock a day and selling the stock on some other day in feature.Return teh maximum profit you can achieve a from this transaction.If making profit is nor possible then return 0; 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {
        System.out.println("Welcome to NSE....");
        System.out.println("Enter the Number of Stocks ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stock[]=new int[n];
        System.out.println("Enter Stocks Price");
        for (int i=0;i<n;i++) {
          stock[i]=sc.nextInt();
        }
        System.out.println("Stock Prices : "+Arrays.toString(stock));
        System.out.println("Maximum Profit Earned In NSE "+getprofit(stock));
    }

    public static int getprofit(int a[])
    {
      int Profit=0;
      int CP=a[0];
      for(int i=1;i<a.length;i++)
      {
        CP=Math.min(CP, a[i]);
        if(a[i]-CP< 0)
         continue;
        Profit=Math.max(Profit,a[i]-CP);
      }
      return Profit;
    }
}

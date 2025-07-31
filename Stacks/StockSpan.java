package Stacks;

import java.util.Stack;

public class StockSpan {
    
    public static void minspan(int stock[],int time[])
    {
        Stack<Integer> st=new Stack<>();
        time[0]=1;
        st.push(0);

        for(int i=1;i<stock.length;i++)
        {
            int currprice=stock[i];
            while(!st.isEmpty() && currprice > stock[st.peek()])
            {
                st.pop();
            }

            if(st.isEmpty())
            {
                time[i]=i+1;
            }
            else{
                int prevHigh=st.peek();
                time[i]=i-prevHigh;
            }

            st.push(i);
        }

    }

    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        

        minspan(stocks, span);

        for(int i=0;i<span.length;i++)
        {
            System.out.println(span[i]);
        }
    }
}

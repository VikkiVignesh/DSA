package Greedy_Algo;

import java.util.Arrays;
import java.util.Comparator;

public class FractinalKnapSack {

     public static void printTable(double a[][])
    {
        System.out.println("Activities Table");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static double getMaxValue(int w[],int v[],int limit)
    {

        // ratio shpuld be always in decending order int ratio[]={4,5,6}; if it is in ascending order then we can loop it in reverse order
        // int ratio[]=new int[w.length];

        // for(int i=0;i<w.length;i++)
        // {
        //     ratio[i]=v[i]/w[i];
        // }
        double KnapSack[][]=new double[w.length][3];
        for(int i=0;i<w.length;i++)
        {
            KnapSack[i][0]=v[i]/(double)w[i];
            KnapSack[i][1]=w[i];
            KnapSack[i][2]=v[i];
        }

        printTable(KnapSack);

        // Arrays.sort(KnapSack,Comparator.comparingDouble(rt -> rt[0]));
        // printTable(KnapSack);

        int cap=limit;
        double maxProfit=0;
        int i=0;
        while (cap!=0) {
            if(cap>=KnapSack[i][1])
            {
                maxProfit+=KnapSack[i][0]*KnapSack[i][1];
                cap-=KnapSack[i][1];
            }
            else{
                maxProfit+=cap*KnapSack[i][0];
                cap=0;
            }
            i++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int capacity=50;
        int values[]={60,100,120};
        int weights[]={10,20,30};
        System.out.println("Max Items to be stored in KnapSack for more profit is : "+ getMaxValue(weights, values, capacity));
    }
}

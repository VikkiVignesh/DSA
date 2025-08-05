package Greedy_Algo;

import java.util.ArrayList;
import java.util.List;

public class CurrencyChange {
    static int money[]={1,2,5,10,20,50,100,500,2000};
    public static void main(String[] args) {
       int Amount=590;
       int Rs=Amount;
       int notes=0;
       List<Integer> Change=new ArrayList<>();
       for(int i=money.length-1;i>=0;i--)
       {
        if(Amount>=money[i])
        {
            while(Amount>=money[i])
            {
             Change.add(money[i]);
             Amount-=money[i];
             notes++;
            }
        }
       }
       System.out.printf("Min notes/coins required for Rs.%d change is : %d",Rs,notes);
       System.out.println();
       System.out.println(Change);
    }
}

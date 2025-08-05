package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// Need to find the max number of activitues performed by single person. 1person can do only 1 work at a time.
public class ActivitySelection {
    

    public static void printTable(int a[][])
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
    public static int getMaxActivity(int s[],int e[])
    {

     int Activities[][]=new int[s.length][3];

     for(int i=0;i<s.length;i++)
     {
        Activities[i][0]=i;
        Activities[i][1]=s[i];
        Activities[i][2]=e[i];
     }

     printTable(Activities);

     Arrays.sort(Activities,Comparator.comparingDouble(act -> act[2]));

     printTable(Activities);
     int act=1;
     int prev=Activities[0][2];
     ArrayList<Integer> list=new ArrayList<>();
     list.add(Activities[0][0]);

     for(int i=1;i<e.length;i++)
     {
        if(Activities[i][1]>=prev)
        {
            act++;
            prev=Activities[i][2];
            list.add(Activities[i][0]);
        }
     }

     System.out.println("Selected Activities.");
     for(int i=0;i<list.size();i++)
     {
        System.out.print("A"+list.get(i)+" ");
     }
     System.out.println();
     return act;
    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9}; //end is already given in sorted order
        System.out.println("Max Number of Activities performed by single person is : "+getMaxActivity(start, end));
    }
}

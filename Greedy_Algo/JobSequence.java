package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSequence {
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
    public static int getMaxprofit(int J[],int D[],int P[])
    {
        int JobMap[][]=new int[J.length][3];
        for(int i=0;i<J.length;i++)
        {
            JobMap[i][0]=J[i];
            JobMap[i][1]=D[i];
            JobMap[i][2]=P[i];
        }
        printTable(JobMap);
        Arrays.sort(JobMap,Comparator.comparingDouble(o->o[2]));
        printTable(JobMap);

        List<String> res=new ArrayList<>();
        int time=0;
        int maxprofit=0;
        for(int i=JobMap.length-1;i>=0;i--)
        {
            if(JobMap[i][1]>time)
            {
                time++;
                maxprofit+=JobMap[i][2];
                res.add(Integer.toString(JobMap[i][0]));
            }
        }
        System.out.println(res);
        return maxprofit;
    }
    public static void main(String[] args) {
        int Jobs[]={1,2,3,4};
        int deadlines[]={4,1,1,1};
        int profit[]={20,10,40,30};
        System.out.println("Max Profit : "+getMaxprofit(Jobs, deadlines, profit));
    }
}

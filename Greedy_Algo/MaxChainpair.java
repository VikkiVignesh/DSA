package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxChainpair {
     public static void printTable(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        printTable(pairs);
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> first=new ArrayList<>();
        first.add(pairs[0][0]);
        first.add(pairs[0][1]);

        res.add(first);

        int prev=pairs[0][1];
        for(int i=1;i<pairs.length;i++)
        {
            if(prev<pairs[i][0])
            {
               List<Integer> temp=new ArrayList<>();
               temp.add(pairs[i][0]);
               temp.add(pairs[i][1]);
               prev=pairs[i][1];
               res.add(temp);
            }
        }

        System.out.println(res);
        System.out.println("Longest possible Chain using pairs is : "+res.size());
    }
}

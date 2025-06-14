package ArraysList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.ListUI;

public class PairSum {

    public static boolean ispairsPossible(ArrayList<Integer> list,int target)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==target)
                 return true;
            }
        }
        return false;
    }


    public static boolean ispairs_TwoPointer(ArrayList<Integer> list,int target)
    {
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp)
        {
            if(list.get(rp)+list.get(lp)==target)
            {
                return true;
            }
            if(list.get(rp)+list.get(lp)<target)
            {
               lp++;
            }
             else if(list.get(rp)+list.get(lp)>target)
            {
                rp--;
            }
        }
        return false;
    }
    public static boolean pairsUsinghash(ArrayList<Integer> List,int target)
    {
        Set<Integer> Set=new HashSet<>();
        for(int i=0;i<List.size();i++)
        {
            int value=target - List.get(i);
            if(Set.contains(value))
            {
                return true;
            }
            else
            {
                Set.add(List.get(i));
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(ispairsPossible(list,41));
        System.out.println(ispairs_TwoPointer(list, 10));
        System.out.println(pairsUsinghash(list, 5));
    }
}

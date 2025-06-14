package ArraysList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rotatedpair_Sum {

    public static boolean ispairs(ArrayList<Integer> List,int target)
    {
       int bp=-1;
       for(int i=0;i<List.size();i++)
        {
            if(List.get(i)>List.get(i+1))
            {
              bp=i;
              break;
            }
        }

        int lp=bp+1;
        int rp=bp;
        while(lp!=rp)
        {
            if(List.get(rp)+ List.get(lp)==target)
            {
                 return true;
            }
            else if(List.get(rp)+ List.get(lp)>target)
            {
                rp=(rp-1)%List.size();
            }
            else{
                lp=(lp+1)%List.size();
            }
        }
       return false;
    }
        
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(16);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(ispairs(list,20));
    }
}

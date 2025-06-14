package ArraysList;

import java.util.ArrayList;
import java.util.Collections;


public class LonelyEle {
    public static ArrayList<Integer> getLonelyElements(ArrayList<Integer>l)
    {
        Collections.sort(l);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=l.size()-2;i++) {
            if(l.get(i-1)+1<l.get(i) && l.get(i)+1< l.get(i+1))
            {
               res.add(l.get(i));
            }
        }
         if(l.size()==1)
            {
                res.add(l.get(0));
            }
        
         if(l.size()>1)
         {
            if(l.get(0)+1 < l.get(1))
            {
                res.add(res.get(0));
            }

             if(l.get(l.size()-2)+1  <l.get(l.size()-1))
            {
                res.add(l.get(l.size()-1));
            }
         }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        ArrayList<Integer> res=getLonelyElements(list);
        System.out.println(res);
    }
}

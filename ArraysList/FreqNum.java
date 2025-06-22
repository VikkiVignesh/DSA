package ArraysList;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FreqNum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(3);
        list.add(6);
        System.out.println(getmaxFreqNum(list));
    }
    public static int getmaxFreqNum(ArrayList<Integer> list)
    {
        int res=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            if(map.containsKey(list.get(i)))
            {
                map.put(list.get(i),map.get(list.get(i))+1);
            }
            else
            {
                map.put(list.get(i),1);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer>m:map.entrySet())
        {
            int value=m.getValue();
            int key=m.getKey();
            System.out.println(key+" -> "+ value);
            if(value>max || (value == max && key >res))
            {
                max=value;
                res=key;
            }
        }
        return res;
    }
}

package ArraysList;

import java.util.ArrayList;

public class Monotonic {

    public static boolean checkmontoic_bruteforce(ArrayList<Integer> ls)
    {
        if(ls.size()==1)
        {
            return true;
        }
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<ls.size()-1;i++)
        {
            if(ls.get(i)>ls.get(i+1))
              inc=false;
            if(ls.get(i)<ls.get(i+1))
              dec=false;
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        System.out.println(checkmontoic_bruteforce(list));
    }
}

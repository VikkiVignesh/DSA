package ArraysList;

import java.util.ArrayList;

//Find the max amount of water stored in th container 
public class WaterContainer {

    public static int getMaxwater_BruteForce(ArrayList<Integer> container)
    {
        int max=container.get(0);
        for(int i=0;i<container.size();i++)
        {
            for(int j=i+1;j<container.size();j++)
            {
                int h=Math.min(container.get(i),container.get(j));
                int w= j-i;
                int currwater=h*w;
                if(max<(currwater))
                {
                    max=currwater;
                }
            }
        }
        return max;
    }

    public static int getMaxwater_ByPointer(ArrayList<Integer> container)
    {
        int ptr1=0;
        int ptr2=container.size()-1;
        int max=container.get(0);

        while(ptr1<ptr2)
        {
            int water=(ptr2-ptr1)*(Math.min(container.get(ptr1), container.get(ptr2)));
            max=Math.max(max, water);
            if(container.get(ptr2) <container.get(ptr1) )
            {
                ptr2--;
            }
            else
            {
                ptr1++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
       ArrayList<Integer> container=new ArrayList<>();
       container.add(1);
       container.add(8);
       container.add(6);
       container.add(2);
       container.add(5);
       container.add(4);
       container.add(8);
       container.add(3);
       container.add(7);
       System.out.println("Maximum water stored in the container : "+ getMaxwater_BruteForce(container));
       System.out.println("Optimised one (2 Pointer approach) : "+getMaxwater_ByPointer(container));
    }
}

package Queue;

import java.util.PriorityQueue;

public class NRopes {

    public static int getMinCost(int arr[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }

        int res=0;
        while (pq.size()>1) {
            int f=pq.poll()
            System.out.println("First : "+f);
            int s=pq.poll();
            System.out.println("Second : "+s);

            res+=f+s;
            pq.add(f+s);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        System.out.println("Min Cost for Joining "+arr.length+" ropes is : "+getMinCost(arr));
    }
}

package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NRopes {

    public static int minCostusing_PQ(int arr[])
    {
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }

        while (pq.size()!=1) {
            int min1=pq.poll();
            int min2=pq.poll();
            sum+=min1+min2;
            pq.add(min1+min2);
        }
        return pq.poll();
    }
     public static int minCostusing_Sort(int arr[])
    {
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        System.out.println(minCostusing_PQ(arr));
        System.out.println(minCostusing_Sort(arr));
    }
}

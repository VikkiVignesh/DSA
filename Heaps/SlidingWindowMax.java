package Heaps;

import java.util.PriorityQueue;

public class SlidingWindowMax {

    static class WindowsDetails implements Comparable<WindowsDetails>
    {
        int val;
        int idx;

        public WindowsDetails(int a,int b)
        {
            this.val=a;
            this.idx=b;
        }

        @Override
        public int compareTo(WindowsDetails win)
        {
            return Integer.compare(win.val, this.val);
        }

    }
    
    public static void main(String[] args) {
        
        int arr[]={1,3,-1,-3,5,3,6,7};
        int n=arr.length;
        int window=3;
        int res[]=new int[n-window+1];

        PriorityQueue<WindowsDetails> pq=new PriorityQueue<>();

        for(int i=0;i<window;i++)
        {
            pq.add(new WindowsDetails(arr[i], i));
        }


        res[0]=pq.peek().val; //First Window max ele

        for(int i=window;i<n;i++)
        {
            while (pq.peek().idx <= (i-window)) {
                pq.remove();
            }

            pq.add(new WindowsDetails(arr[i], i));
            res[i-window+1]=pq.peek().val;
        }

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}

package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaHistogram {

    public static int getmaxArea(int h[])
    {

        int left[]=new int[h.length];
        int right[]=new int[h.length];

        Stack<Integer> s=new Stack<>();
        for(int i=0;i<h.length;i++)
        {
            while (!s.isEmpty() && h[s.peek()] >=h[i]) {
                s.pop();
            }
            if(s.isEmpty())
            {
                left[i]=-1;
            }
            else
            {
                left[i]=s.peek();
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            s.pop();
        }

         for(int i=h.length-1;i>=0;i--)
        {
            while (!s.isEmpty() && h[s.peek()] >=h[i]) {
                s.pop();
            }
            if(s.isEmpty())
            {
                right[i]=h.length;
            }
            else
            {
                right[i]=s.peek();
            }
            s.push(i);
        }


        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<h.length;i++)
        {
            int area=h[i]*(right[i]-left[i]-1 );
            maxArea=Math.max(maxArea, area);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        System.out.println(getmaxArea(heights));
    }
}

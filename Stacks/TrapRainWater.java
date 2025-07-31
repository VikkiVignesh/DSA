package Stacks;

import java.util.Stack;

public class TrapRainWater {
    public static int getTrappedWater(int h[])
    {
        int water=0;
        Stack<Integer> s= new Stack<>();

        for(int i=0;i<h.length;i++)
        {
            while (!s.isEmpty() &&h[s.peek()]<h[i] ) {
                int prev_h=h[s.pop()];
                int dist=i-s.peek()-1;

                if(s.isEmpty())
                {
                    break;
                }
                int min_h=Math.min(h[s.peek()], h[i]-prev_h);
                water+=dist*min_h;
            }

            s.push(i);
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[]={7, 0, 4, 2, 5, 0, 6, 4, 0, 6};
        System.out.println(getTrappedWater(arr));
    }
}

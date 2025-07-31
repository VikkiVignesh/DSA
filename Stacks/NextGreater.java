package Stacks;

import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

    public static void findnxt_greater(int a[])
    {
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[a.length]; //array for storing the result

        for(int i=a.length-1;i>=0;i--)
        {
            while (!s.isEmpty() && a[s.peek()] < a[i]) {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxtGreater[i]=-1;
            }
            else
            {
                nxtGreater[i]=a[s.peek()];
            }
        s.push(i);
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(nxtGreater));
    }
    public static void main(String[] args) {
        int arr[]={6,8,10,1,3};
        findnxt_greater(arr);
    }
}

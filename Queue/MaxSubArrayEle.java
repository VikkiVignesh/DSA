package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSubArrayEle {

    public static void printMaxEle(int a[],int n,int k)
    {
        int i;
        Deque<Integer> q=new LinkedList<>();
        for(i=0;i<k;i++)
        {
          while (!q.isEmpty() && a[i]>=a[q.peek()]) {
             q.removeLast();
          }
          q.add(i);
        }

        for(;i<n;i++)
        {
            System.out.print(a[q.peek()]+" ");

            while (!q.isEmpty() && q.peek() <= i-k) {
                q.removeFirst();
            }

            while (!q.isEmpty() && a[i]>=a[q.peekLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }
        System.out.println(a[q.peek()]+" ");
    }
    public static void main(String[] args) {
        int arr[]={ 12, 1, 78, 90, 57, 89, 56 };
        printMaxEle(arr, arr.length, 3);
    }
}

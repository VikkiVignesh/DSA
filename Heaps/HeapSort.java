package Heaps;

import java.util.Arrays;

public class HeapSort {

    public static void heapify(int a[],int i,int size)
    {
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        if(left<size && a[left]>a[maxIdx])
        {
            maxIdx=left;
        }
        if(right<size && a[right]>a[maxIdx])
        {
            maxIdx=right;
        }
        if(maxIdx!=i)
        {
            int temp=a[i];
            a[i]=a[maxIdx];
            a[maxIdx]=temp;

            heapify(a, maxIdx, size);
        }
    }

    public static void sortHeap(int arr[])
    {
        int n=arr.length;
        // Covert to max heap using non leaf nodes
        for(int i=n/2;i>=0;i--)
        {
            heapify(arr,i,n);
        }


        //Find teh largest value and swap teh first and last elem
        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        sortHeap(arr);
        System.out.println(Arrays.toString(arr));
    }
}

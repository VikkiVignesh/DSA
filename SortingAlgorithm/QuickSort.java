import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements ");
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sort "+Arrays.toString(arr));
        quick_sort(arr, 0, size-1);
        System.out.println("After Sort "+Arrays.toString(arr));
    }
    public static int pivot(int a[],int si,int ei)
    {
      int pivot=a[ei];
      int i=si-1;

     for(int j=si;j<ei;j++)
     {
        if(a[j]<=pivot)
        {
            i++;
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
     }
     i++;
     int temp=pivot;
     a[ei]=a[i];
     a[i]=temp;
     return i;
    }

    public static void quick_sort(int a[],int start,int end)
    {
        if (start < end) { // Base condition to stop recursion
            int pidx = pivot(a, start, end); // Find the pivot index
            quick_sort(a, start, pidx - 1); // Recursively sort the left subarray
            quick_sort(a, pidx + 1, end); // Recursively sort the right subarray
        }
    }
}

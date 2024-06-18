import java.util.*;

public class ReverseByK {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        System.out.println("Original Array "+Arrays.toString(arr));
        reverse(arr, 0, arr.length-1);
        System.out.println("1 rotate Array "+Arrays.toString(arr));

        Ktimes(arr,2);
        System.out.println("Reverse Array By 2 Times"+Arrays.toString(arr));
       
    }

    public static void Ktimes(int a[],int k)
    {
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
    }

    public static void reverse(int a[],int m,int n)
    {
        int i=m;
        int j=n;
        while(i<j)
        {
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }
    }
}

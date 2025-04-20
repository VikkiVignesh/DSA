import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the Size of array : ");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // System.out.println("Enter the array elements ");
        // for (int i=0;i<size;i++) {
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Before Sort "+Arrays.toString(arr));
        // divide(arr, 0, size-1);
        // System.out.println("After Sort "+Arrays.toString(arr));

        String str[]={"sun","earth","mars","mercury"};
        dividestr(str, 0, str.length-1);
        System.out.println(Arrays.toString(str));
    }

    public static void divide(int a[],int i,int j)
    {
        if(i>=j)
        {
            return;
        }
        int mid=(i+j)/2;
        divide(a, i, mid);
        divide(a, mid+1, j);
        merge_sort(a,i,mid,j);
    }
    public static void merge_sort(int ar[],int start,int mid,int end)
    {
         int temp[]=new int[end-start+1];
         int i=start;
         int j=mid+1;
         int k=0;

         while(i<=mid && j<=end)
         {
            if(ar[i]<=ar[j])
            {
                temp[k++]=ar[i++];
            }
            else
            {
                temp[k++]=ar[j++];
            }
         }

         while (i<=mid) {
            temp[k++]=ar[i++];
         }

         while(j<=end)
         {
            temp[k++]=ar[j++];
         }
         
         for(k=0,i=start;k<temp.length;k++,i++)
         {
            ar[i]=temp[k];
         }
    }


    public static void dividestr(String str[],int si,int ed)
    {
        if(si>=ed)
        {
            return;
        }
        int mid=(si+ed)/2;
        dividestr(str, si,mid);
        dividestr(str, mid+1, ed);
        merge_strarr(str,si,ed,mid);
    }

    public static void merge_strarr(String s[],int si,int ed,int mid)
    {
        String temp[]=new String[ed-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<= mid && j<=ed)
        {
            if(s[i].compareTo(s[j])<=0)
            {
                temp[k++]=s[i++];
            }
            else
            {
                temp[k++]=s[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=s[i++];
        }
        while(j<=ed)
        {
            temp[k++]=s[j++];
        }

        for(k=0,i=si;i<temp.length;i++,k++)
        {
            s[i]=temp[k];
        }
    }
}






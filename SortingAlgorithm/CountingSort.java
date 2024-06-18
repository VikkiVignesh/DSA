package SortingAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
// import _Arrays.Frequency;
public class CountingSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        // Frequency fq=new Frequency();
        int Freq[]=getFreq(arr);
        System.out.println(Arrays.toString(Freq));

        cntsort(arr, Freq);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] getFreq(int a[])
    {
        int max=getmax(a);
        int temp[]=new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            temp[a[i]]++;
        }
        return temp;
    }
    public static int getmax(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
             max=a[i];
        }
        return max;
    }

    public static void cntsort(int a[],int freq[])
    {
        int k=0;
        for(int i=0;i<freq.length;i++)
        {
          while(freq[i]>0)
          {
            a[k++]=i;
            freq[i]--;
          }
        }
    }
}

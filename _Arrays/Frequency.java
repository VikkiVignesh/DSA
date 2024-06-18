package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Frequency Array ");
        System.out.println(Arrays.toString(getFreq(arr)));
        int freq[]=getFreq(arr);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=freq[arr[i]];
        }
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
}

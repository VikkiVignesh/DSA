/*Selection sort is a sorting Algorithm in which it will selects the smallest element and  
pushes that element to first placed of sorted array and then second place ..etc... */
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Range of Array : ");
        int size=s.nextInt();
        int ar[]=new int[size];
        input(ar, s);
        System.out.println("Entered Array is ");
        display(ar);
        System.out.println("___________________Selection Sort___________________");
        Selectionsort(ar);
        display(ar);

    }


    static void Selectionsort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int min=i; 
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            swap(a,i,min);
        }
    }

    static void swap(int a[],int i,int j)
    {
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
    }
    static void input(int a[],Scanner sc)
    {
       System.out.println("Enter the Elements of Array");
       for(int i=0;i<a.length;i++)
       {
        a[i]=sc.nextInt();
       }
    }
    static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit of Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements : ");
        for (int i =0;i<arr.length;i++) {
           arr[i]=sc.nextInt();   
        }
        System.out.println("Entered Array ");
        display(arr);
        Bubble_Sort(arr);
        display(arr);
        sc.close();
    }
    static void Bubble_Sort(int a[]) {
        for (int i=0;i<a.length-1;i++) // a.length-1 bcz we are comparing one element with other ,so when comes to last ele we could not find comparision element
        {
          for(int j=0;j<a.length-i-1;j++)
          {
            if(a[j+1]<a[j])
            {
                swap(a,j+1,j);
            }
          }   
        }
    }

    static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int a[],int i,int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

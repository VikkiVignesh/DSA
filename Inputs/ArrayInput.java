package Inputs;
import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
    }

    public static void input_array(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"] :");
            a[i]=sc.nextInt();
        }
        System.out.println();
    }

    public static void print_arr(int a[])
    {
        System.out.println(Arrays.toString(a));
    }
}

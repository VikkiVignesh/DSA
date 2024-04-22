package SearchingAlgorithms;

import java.util.*;
import Inputs.ArrayInput;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayInput.input_array(arr);
        ArrayInput.print_arr(arr);

        System.out.println("Enter the key to search");
        int key=sc.nextInt();

        System.out.println("Element "+key+" is present in the Index "+findElement(arr, key));
    }

    public static int findElement(int a[],int key)
    {
        int ind=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                ind=i;
                break;
            }
        }
        return ind;
    }
}

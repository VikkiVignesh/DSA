package Recursion;

public class SortValidation {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,81,9};
        System.out.println("Is Array Sorted : "+issorted(arr, 0));
    }
    public static boolean issorted(int arr[],int i)
    {
       if(i==arr.length-1)
       {
        return true;
       }
       if(arr[i]>arr[i+1])
       {
        return false;
       }
       return issorted(arr, i+1);
    }
}

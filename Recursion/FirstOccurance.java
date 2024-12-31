package Recursion;

public class FirstOccurance {
    public static void main(String[] args) {
        int []arr={2,4,5,68,6,5,4,3,2,1};
        System.out.println("First Occurance of a number in array "+checknum(arr, 0, 6));
    }

    public static int checknum(int ar[],int i,int key)
    {
        if(i==ar.length)
         return -1;
        if(ar[i]==key)
          return i;
        return checknum(ar, i+1, key);
    }
}

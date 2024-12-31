package Recursion;

public class LastOccurance {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,2,6,7,2,7,4};
        System.out.println(lastoccur(arr, 0, 2));
    }
    public static int lastoccur(int a[],int i,int key)
    {
        if(i==a.length-1)
        {
            return -1;
        }
        int index=lastoccur(a, i+1, key);
        if(index == -1 && a[i]==key)
        {
            return i;
        }

        return index;
    }
}

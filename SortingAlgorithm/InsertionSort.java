import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]={3,5,78,90,2,-1};
        System.out.println(Arrays.toString(a));
        insertionsort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionsort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
           a[j+1]=key;
        }
    }
}

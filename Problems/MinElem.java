import java.util.*;
public class MinElem {
    public static void main(String[] args) {
        int a[]={5,6,1,2,3,4};
        //find the miniumum element in the rotated sorted array
        System.out.println("Finding Smallest Element");
       System.out.println("Smallest Element in the Array is "+search(a));
    }

    static int search(int a[])
    {  
        int l=0;
        int h=a.length-1;
        while(l<h)
        {
            int mid=(l+h)/2;
            if(a[mid]>a[h])
            {
                l=mid+1;
            }
            else
            {
                h=mid;
            }
            
        }
        return a[l];
    }
}

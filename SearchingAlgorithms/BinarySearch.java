package SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={3,5,7,9,10,47};
        if(binsearch(a, 1))
          System.out.println("Element Present In Array!!!");
        else
          System.out.println("Element Doesnot Exists...");
    }

    public static boolean binsearch(int a[],int key)
    {
        int l=0;
        int r=a.length-1;
        while(l<=r )
        {
            int mid=(l+r)/2;
            if(key==a[mid])
              return true;
            else if(a[mid]>key)
              r=mid-1;
            else
              l=mid+1;
        }
        return false;
    }
}

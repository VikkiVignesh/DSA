import java.util.Arrays;

import javax.lang.model.type.ArrayType;

public class BinarySearchCode {
    public static void main(String[] args) {
        int arr[]={6,5,4,1,7,0,9,8,-5,34,7,90};
        Arrays.sort(arr);
        int key=34;
        System.out.println(key+" is present at the index "+BinarySeach(arr, key));
    }

    public static int BinarySeach(int a[],int k)
    {
        int low=0;
        int high=a.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(a[mid]==k)
            {
              return mid;
            }
            else if(a[mid]>k)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
}

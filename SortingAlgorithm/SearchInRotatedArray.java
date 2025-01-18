public class SearchInRotatedArray {
    public static void main(String[] args) {
        int a[]={4,5,-1,0,2,3};
        System.out.println(getIndex(a, 0, a.length-1, 0));
    }
    public static int getIndex(int a[],int st,int ed,int key)
    {
        if(st>ed)
        {
            return -1;
        }
        int mid=(st+ed)/2;

        if(a[mid]==key)
        {
            return mid;
        }
        if(a[st]<=key && key<=a[ed])
        {
            if(a[st]<=key)
            {
                return getIndex(a, st, mid-1, key);
            }
            else
            {
                return getIndex(a, mid+1, ed, key);
            }
        }
        else
        {
            if(a[mid]<=key)
            {
                return getIndex(a, mid+1,ed, key);
            }
            else
            {
                return getIndex(a, st,mid-1, key);
            }
        }
    }
}

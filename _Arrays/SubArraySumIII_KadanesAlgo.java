public class SubArraySumIII_KadanesAlgo {

    public static void main(String[] args) {
        int arr[]={-2,-1,3,5,6,-3,0,4};

        System.out.println("Max subarray sum is "+kadanesAlgo(arr));
    }
    public static int kadanesAlgo(int a[])
    {
        int max=0;
        int cs=0;
        for(int i=0;i<a.length;i++)
        {
             cs+=a[i];
             if(cs<0)
              cs=0;
            max=Math.max(max, cs);
            
        }
        return max;
    }
}
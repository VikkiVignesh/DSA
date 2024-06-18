public class LargestNum {
    public static void main(String[] args) {
        int arr[]={4,7,10,4,56,98,0,3,-2,4};
        System.out.println("Largest Number is "+findLargest(arr));
    }

    public static int findLargest(int a[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
        }
        return max;
    }
}

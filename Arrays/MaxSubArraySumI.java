public class MaxSubArraySumI {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        System.out.println("Max Sub Array Sum "+maxsub_sum(a));
    }

    public static int maxsub_sum(int a[])
    {
        int sum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<a.length-1;i++)
        {  
            for(int j=i+1;j<a.length;j++)
            { currsum=0;
                for(int k=i;k<=j;k++)
                {
                    currsum+=a[k];

                    if(currsum>sum)
                    {   sum=currsum;
                    }
                    System.out.println("Current Sum "+currsum);
                }
                
            }
            System.out.println();
        }
        return sum;
    }
}

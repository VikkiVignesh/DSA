import java.util.Arrays;

public class MaxSubArrayII {
    public static void main(String[] args) {
        int a[]={1,-2,6,-1,3};
        int max=find_maxsum(a);
        System.out.println("MAx Sub Array sum is "+max);
    }

    public static int find_maxsum(int a[])
    {
        int sum=Integer.MIN_VALUE;
        int currsum=0;

        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
          prefix[i]=prefix[i-1]+a[i];
        }

        System.out.println("Prefix Array is "+Arrays.toString(prefix));
        for(int i=0;i<a.length;i++)
        {  
            for(int j=i;j<a.length;j++)
            { 
             currsum= i==0? prefix[i]:prefix[j]-prefix[i-1];
            System.out.println(currsum);
                if(currsum>sum)
                 sum=currsum;
            }
            System.out.println();
        }
        return sum;
    }
}

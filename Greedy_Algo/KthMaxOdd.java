package Greedy_Algo;

public class KthMaxOdd {
    public static int getMaxOdd(int l,int r,int k)
    {
        int ans=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=l;i<r;i++)
        {
            if(i%2!=0 && i>=ans)
            {
               ans=i;
            }
            if(cnt==i)
            {
                return ans;
            }
            cnt++;
        }
        return ans;
    }

    public static int getKthOdd(int a[],int k)
    {
        if(k<0)
        {
            return 0;
        }
        int L=a[0];
        int R=a[1];

        if((R&1)>0)
        {
            System.out.println(R&1);
            int cnt=(int)Math.ceil((R-L+1)/2);
            System.out.println(cnt);
            if(k>cnt)
            {
                return 0;
            }
            else{
                System.out.println(R-2*k+2);
                return (R-2*k+2);
            }
        }
        else
        {
            System.out.println("Else");
            int cnt=(int)Math.ceil((R-L+1)/2);
            if(k>cnt)
            {
                return 0;
            }
            else{
                System.out.println(R-2*k+1);
                return (R-2*k+1);
            }
        }
    }
    public static void main(String[] args) {
        int l=-3;
        int r=3;
        int k=0;
        System.out.println(k+" th MaxOdd number in Range ["+l+","+r+"] is :"+getMaxOdd(l, r, k));
        int a[]={-10,10};
        System.out.println(getKthOdd(a,8));
    }
}

public class MajorityEle {
    public static void main(String[] args) {
        int a[]={2,3,4,4,2,2,2,1,4,4,4};
        System.out.println(getmajority(a));
        System.out.println(majoritynum(a, 0, a.length-1));
    }

    public static int getmajority(int a[]) {
        int maxcnt=a.length/2;
        for(int i=0;i<a.length;i++)
        {
            int cnt=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    cnt++;
                }
            }
            if(cnt>maxcnt)
            {
                return a[i];
            }
        }
        return -1;
    }


    public static int findrg(int a[],int lo,int hg,int num)
    {
        int cnt=0;
        for(int i=lo;i<hg;i++)
        {
            if(a[i]==num)
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static int majoritynum(int a[],int lo,int hg)
    {
        if(lo==hg)
          return a[lo];

        int mid=(hg-lo)/2+lo;
        int left=majoritynum(a, lo, mid);
        int right=majoritynum(a, mid+1, hg);

        if(left==right)
         return left;

        int leftcnt=findrg(a, lo, hg, left);
        int rightcnt=findrg(a, lo, hg, right);

        return leftcnt>rightcnt ? left :right;
    }
}

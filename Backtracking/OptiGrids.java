public class OptiGrids {

    public static int getfact(int x)
    {
        if(x==0 || x==1)
        {
            return 1;
        }
        return x*getfact(x-1);
    }
    public static int getOptWays(int n,int m)
    {
        int res=0;
        int numerator=getfact(n-1+m-1);
        int d1=getfact(n-1);
        int d2=getfact(m-1);
        res=numerator/(d1*d2);
        return res;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println("Total possible ways : "+getOptWays(n, m));
    }
}

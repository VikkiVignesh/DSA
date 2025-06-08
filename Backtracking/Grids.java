public class Grids {

    public static int getways(int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        else if(i==n || j==n)
        {
            return 0;
        }

        int w2=getways(i, j+1, n, m);
        int w1=getways(i+1, j, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(getways(0, 0, n, m));
    }
}

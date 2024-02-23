public class FloydsTri {
    public static void main(String[] args) {
        printtri(5, 1);
    }

    static public void printtri(int r,int c)
    {
       for(int i=1;i<=r;i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print(c+++" ");
        }
        System.out.println();
       }
    }
}

public class Butterfly {
    public static void main(String[] args) {
        printButterfly(4);
        printButterfly(5);
    }

    static void printButterfly(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=(r-i)*2;k++)
            {
                System.out.print(" ");
            }
            
            for(int m=1;m<=i;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=(r-i)*2;k++)
            {
                System.out.print(" ");
            }
            
            for(int m=1;m<=i;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}

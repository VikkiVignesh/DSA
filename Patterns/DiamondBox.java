import java.util.*;
public class DiamondBox {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows (in terms 2*r) :");
        int n=sc.nextInt();
        int c=1;
        for(int i=0;i<=2*n;i++)
        {
            System.out.print("- ");
        }
        System.out.println();
        for(int i=1;i<n;i++)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print("- ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(i+" ");
            }

            for(int m=0;m<n-i+1;m++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }

        for(int i=n;i>-1;i--)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print("- ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i +" ");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(i+" ");
            }

            for(int m=0;m<n-i+1;m++)
            {  if(m!=n)
                System.out.print("- ");
            }
            System.out.println();
        }
       
    }
}


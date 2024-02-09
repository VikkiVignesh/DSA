import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>0;k--)
            {
                System.out.print(k);
            }
            for(int m=2;m<=i;m++)
            {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}

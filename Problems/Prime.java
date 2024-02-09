import java.util.*;
public class Prime
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        int flag=0;
        System.out.println("Enter Any Number: ");
        n=sc.nextInt();
        if(n==0 || n==1)
        {
            System.out.println("Not a Prime Number");
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
              System.out.println(n+" Not a Prime Number");
              flag=1;
              break;
            }

        }
        if(flag==0)
        {
            System.out.println(n+" is Prime");
        }

    }
}
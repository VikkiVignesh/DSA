import java.util.Scanner;

public class FastExponentation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number ");
        int num=sc.nextInt();
        System.out.println("Enter the power of num :");
        int pow=sc.nextInt();
        System.out.println("Fast Expo "+fastExpo(num,pow));

    }

    public static int fastExpo(int n,int p) {
        int ans=1;
        while(p>0)
        {
            if((p&1)!=0)
            {
                ans=ans*n;
            }
            n=n*n;
            p=p>>1;
        }
        return ans;
    }
}

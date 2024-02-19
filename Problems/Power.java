import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to Find it's power");
        int num=sc.nextInt();
        System.out.println("Enter the Exponential term");
        int e=sc.nextInt();
        System.out.println("Power of "+num+" is "+power(num, e));
    }

    static int power(int n,int e)
    {
        if(n==0)
         return 0;
        if(e==0)
         return 1;
        return n*power(n, e-1);
    }
}

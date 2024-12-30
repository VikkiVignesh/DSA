package Oops;
import java.util.*;
public class Complexnumop {
    public static void main(String[] args) {
        System.out.println("Enter the Number of complex numbers");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ComplexNum complexArr[]= new ComplexNum[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Complex Number"+(i+1));
            int real = sc.nextInt();
            int imaginary = sc.nextInt();
            complexArr[i] = new ComplexNum(real, imaginary);
        }

        for(ComplexNum cnum : complexArr) {
            System.out.println(cnum);
        }
        if (n > 1) {
            System.out.println("\nPerforming operations on the first two complex numbers:");
            ComplexNum sum = complexArr[0].add(complexArr[1]);
            ComplexNum diff = complexArr[0].sub(complexArr[1]);
            ComplexNum product = complexArr[0].mul(complexArr[1]);

            System.out.println("Sum: " + sum.a+" i"+sum.b+"\n");
            System.out.println("Difference: " + diff.a+" i"+diff.b+"\n");
            System.out.println("Product: " +  product.a+" i"+product.b+"\n");
        }
    }
}

class ComplexNum
{
    int a;
    int b;

    ComplexNum(int x,int y)
    {
        this.a=x;
        this.b=y;
        System.out.println("Complex Number"+a+"i"+b+"Initialised");
    }

    ComplexNum add(ComplexNum z)
    {
        ComplexNum sum=new ComplexNum(0, 0);
        sum.a=this.a+z.a;
        sum.b=this.b+z.b;
        return sum;
    }
    ComplexNum sub(ComplexNum z)
    {
        ComplexNum sub=new ComplexNum(0, 0);
        sub.a=this.a-z.a;
        sub.b=this.b-z.b;
        return sub;
    }
    ComplexNum mul(ComplexNum z)
    {
        ComplexNum mul=new ComplexNum(0, 0);
        mul.a=this.a*z.a;
        mul.b=this.b*z.b;
        return mul;
    }
}
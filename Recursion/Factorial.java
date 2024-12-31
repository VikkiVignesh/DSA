package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        System.out.println("Factorial of Number "+fact(n));
    }

    public static int fact(int n)
    {
        if(n==0 || n==1)
         return 1;
        return n*fact(n-1);
    }
}

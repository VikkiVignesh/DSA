package Recursion;
import java.util.*;
public class SumofNumbers {
    public static void main(String[] args) {
         int n= new Scanner(System.in).nextInt();
        System.out.println("Sum of numbers is "+sum(n));
    }

    public static int sum(int n)
    {
        if(n==0)
         return 0;
        
        return n+sum(n-1);
    }
}

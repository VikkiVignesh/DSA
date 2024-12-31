package Recursion;
import java.util.*;
public class Fibbonaci {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        System.out.println(n+" th element of Fibbonacci sreies is "+fibo(n));
        System.out.println("Fibbonacci Series");
        //printfibo(n);
    }

    public static int fibo(int n)
    {
        if(n==0){
            //System.out.println(0);
         return 0;
        }
        if(n==1||n==2){
            //System.out.println(1);
         return 1;}
         //System.out.println(fibo(n-2)+fibo(n-1));
        return fibo(n-2)+fibo(n-1);
    }

    
}

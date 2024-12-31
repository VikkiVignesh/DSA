package Recursion;

public class NumToString {
    static String number[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
     convert(2025);   
    }

    public static void convert(int n)
    {
        if(n==0)
         return;
        int rem=n%10;
        convert(n/10);
        System.out.print(number[rem]+" ");
    }
}

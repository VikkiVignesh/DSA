package Recursion;

public class Printnum {
    public static void main(String[] args) {
        print(10);
        printInt(10);
    }

    public static void print(int n)
    {
        if(n<1)
        {
         return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void printInt(int v)
    {
        if(v<1)
          return;
        printInt(v-1);
        System.out.println(v);
    }
}

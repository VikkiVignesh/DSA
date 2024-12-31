package Recursion;

public class Tiling {
    /*Question says There is a 2*n size of floor and 2*1 sized tile.We have to find number of ways tile can be arranged in floor */
    public static void main(String[] args) {
        System.out.println(arrange(4));
        System.out.println(arrange4(5));
    }

    public static int arrange(int n)
    {
        if(n==0 || n==1)
         return 1;
        int vert=arrange(n-1);
        int hori=arrange(n-2);
        return vert+hori;
    }

    public static int arrange4(int n)
    {
        if(n==0 || n==1 || n==2 || n==3)
         return 1;
        int vert=arrange4(n-1);
        int hori=arrange4(n-4);
        return vert+hori;
    }
}

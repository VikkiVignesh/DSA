package Recursion;

public class BinaryString {
    public static void main(String[] args) {
        printStrings(3, 1, "");
    }
    public static void printStrings(int n,int lastele,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }

        printStrings(n-1, 0, str+"0");
        if(lastele==0)
        {
            printStrings(n-1, 1, str+"1");
        }
    }
}

import java.util.*;
public class HallowRect {
    public static void main(String[] args) {
       printstars(10,5);
       rotatedreverse(6);
       inverted(5);
    }

    static void printstars(int rows,int cols)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(i==0 || j==0 || i==rows-1 || j==cols-1)
                 System.out.print("*");
                else
                 System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void rotatedreverse(int row)
    {
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<row-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void inverted(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=r;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

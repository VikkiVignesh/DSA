
import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of Columns");
        int c=sc.nextInt();
        System.out.println("Enter the Matrix Element");
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Array");
        print(mat);
        System.out.println("Spiral Representation");
        printSpiral(mat, r, c);

    }

    public static void print(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void printSpiral(int a[][],int r,int c)
    {
        int startrow=0;
        int startcol=0;
        int endrow=r-1;
        int endcol=c-1;

        while (startrow<=endrow && startcol<=endcol) {

            //Top
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(a[startrow][j]+"  ");
            }
            startrow++;

            //Right
            for(int i=startrow;i<=endrow;i++)
            {
                System.out.print(a[i][endcol]+"  ");   
            }
            endcol--;

            //Bottom
            for(int j=endcol;j>=startcol;j--)
            {
                System.out.print(a[endrow][j]+"  ");
            }
            endrow--;

            //Left
            for(int i=endrow;i>=startrow;i--)
            {
                System.out.print(a[i][startcol]+"  ");
            }
            startcol++;
        }
    }
}

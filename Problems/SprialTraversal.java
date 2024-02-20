import java.util.*;
public class SprialTraversal {
    public static void main(String[] args) {
        int arr[][]={ {1,2,3,4,0},{5,6,0,7,8},{0,9,10,11,12},{13,0,14,15,16}};
        display(arr);
        System.out.println("Spiral Traversal ");
        sprialtravrse(4, 5, arr);
        
    }
    static void display(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sprialtravrse(int row,int col,int a[][])
    {
        int i,r=0,c=0;
        while(r<row && c<col)
        {
            //printing 1st row
            for(i=c;i<col;i++)
            {
                System.out.print(a[r][i]+" ");
            }
            r++;

            //printing last column
            for(i=r;i<row;i++)
            {
                System.out.print(a[i][col-1]+" ");
            }
            col--;

            //printing last row elements
            if(r<row)
            {
                for(i=col-1;i>=c;i--)
                {
                    System.out.print(a[row-1][i]+" ");
                }
                row--;
            }

            //printing 1st column element
            if(c<col)
            {
                for(i=row-1;i>=r;i--)
                {
                    System.out.print(a[i][c]+" ");
                }
                c++;
            }
            System.out.println();
        }
        
    }
}

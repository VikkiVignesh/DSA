import java.util.Scanner;

public class RowMedian {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int ro=sc.nextInt();
        

        int mat[][]=new int[ro][];
        inputMatrix(mat, ro, sc);

        display(mat);

        for(int i=0;i<ro;i++)
        {
            if(mat[i].length%2!=0)
            {
                System.out.println(i+1+" th Row's Median "+mat[i][mat[i].length/2]);
            }
            else
            {
                System.out.println(i+1+" th Row's Median "+( mat[i][(mat[i].length/2 -1)]+mat[i][mat[i].length/2]));
            }
        }
    }


    
    static void inputMatrix(int a[][],int r,Scanner sc)
    {
        for(int i=0;i<r;i++)
        {  System.out.println("Enter the number of columns : ");
           int col=sc.nextInt();
           a[i]=new int[col];
            for(int j=0;j<col;j++)
            {
                System.out.print("Enter a["+i+"]["+j+"] : ");
                a[i][j]=sc.nextInt();
                System.out.println();
            }
        }
    }

    static void display(int mat[][])
    {
      for(int i=0;i<mat.length;i++)
      {
        for(int j=0;j<mat[i].length;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
      }
    }
}

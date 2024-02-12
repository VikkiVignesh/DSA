import java.util.Scanner;

public class SortedOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int ro=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col=sc.nextInt();

        int mat[][]=new int[ro][col];
        inputMatrix(mat, ro, col, sc);
       
        System.out.println("Normal Method of Displaying Array");
        display(mat);


    }


    static void display_row_col(int a[][])
    {

    }

    static void inputMatrix(int a[][],int r,int c,Scanner sc)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
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

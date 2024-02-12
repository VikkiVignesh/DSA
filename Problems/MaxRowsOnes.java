import java.util.Scanner;

public class MaxRowsOnes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int ro=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col=sc.nextInt();

        int mat[][]=new int[ro][col];
        inputMatrix(mat, ro, col, sc);
        display(mat);

        int max=0;
        int row=0;
        for(int i=0;i<mat.length;i++)
        {  
           int cnt=0;
           for(int j=0;j<mat[i].length;j++ )
           {
               if(mat[i][j]==0) continue;
               else if(mat[i][j]==1)
                 cnt++;
           }
           if(cnt>=max)
           {
            max=cnt;
            row=i;
           }
        }
        System.out.println("Row With Maximum 1's is "+(row+1)+" has "+max+" 1's");
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

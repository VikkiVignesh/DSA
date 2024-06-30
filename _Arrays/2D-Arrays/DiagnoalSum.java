import java.util.Scanner;

public class DiagnoalSum {
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
        print(mat);
        System.out.println("Diagonal Sum of Array is "+diasum(mat));
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
    public static int diasum(int a[][])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                {
                    sum+=a[i][j];
                }
                else if(i+j==a[i].length-1)
                {
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }
}

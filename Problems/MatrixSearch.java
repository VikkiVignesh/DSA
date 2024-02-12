import java.util.Scanner;

public class MatrixSearch {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int ro=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col=sc.nextInt();

        int mat[][]=new int[ro][col];
        inputMatrix(mat, ro, col,sc);

        display(mat);
        
        System.out.println("Enter the Key value to Search Element in the Matrix");
        int key=sc.nextInt();
        
        int i;
        for(i=0;i<mat.length;i++)
        {
            if(binarySearch(mat[i], key))
            {
                System.out.println(key+" found in the Matrix");
                break;
            }    
        }
        if(i==mat.length)
          System.out.println(key+" Not found in the Matrix");
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

    static boolean binarySearch(int a[],int k)
    {
        int l=0;
        int r=a.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(a[mid]==k)
            {
                return true;
            }
            else if(a[mid]>k)
            {
                r=mid-1;
            }
            else
            {
               l=mid+1;
            }
        }
        return false;
    }
    
}

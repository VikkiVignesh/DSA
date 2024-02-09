import java.util.*;
public class ReverseStarPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  Rows");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
  }
}

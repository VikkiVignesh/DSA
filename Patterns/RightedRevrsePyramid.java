import java.util.*;
public class RightedRevrsePyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


package Inputs;

import java.util.*;
public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m=sc.nextInt();

        System.out.println("Enter number of columns");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
    }

    public static void input_array(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print("a["+i+"]["+j+"] :");
            a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
    }
    public static void display_array(int a[][])
    {
        for (int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
